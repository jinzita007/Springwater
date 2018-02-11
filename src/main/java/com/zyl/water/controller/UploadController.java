package com.zyl.water.controller;
import com.qiniu.common.QiniuException;
import com.zyl.water.common.enums.ResponseEnum;
import com.zyl.water.domain.Img;
import com.zyl.water.domain.Qiniu;
import com.zyl.water.domain.Response;
import com.zyl.water.service.ImgService;
import com.zyl.water.util.QiniuUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

/**
 * 上传文件类
 */

@RestController
public class UploadController {

    private static final Logger logger = LoggerFactory.getLogger(UploadController.class);


    @Autowired
    ImgService imgService;

    @Value("${upload.path}")
    private String path;

    @Value("${file.server.host}")
    private String host;

    @Autowired
    private QiniuUtil qiniuUtil;

    /**
     * 第一种上传方式
     * @param file
     * @return
     * @throws IOException
     */
    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public  Map<String, Object> upload(@RequestParam MultipartFile file) throws IOException {

        // 先判断文件是否为空
        if (!file.isEmpty()) {
            // 获得原始文件名
            String fileName = file.getOriginalFilename();
            InputStream is = file.getInputStream();

            Files.copy(is, Paths.get(path + fileName),
                    StandardCopyOption.REPLACE_EXISTING);
            logger.info(fileName);

            Img img = new Img();
            img.setUrl(path+fileName);
            img.setStatus(true);
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            img.setCreatetime(timestamp);

            imgService.insert(img);
            Map<String, Object> map = new HashMap<>();
            map.put("msg", "上传成功!");
            map.put("id",img.getId());
            map.put("url",img);
            return map;

        } else {
            Map<String, Object> map = new HashMap<>();
            map.put("error", "上传失败!");
            return map;
        }

    }

    /**
     * 第二种方式上传文件到七牛云存储
     * @return
     * @throws IOException
     */
    @RequestMapping(value = "/uploadqiniu", method = RequestMethod.POST)
    public Map<String, Object> uploads(@RequestParam("file") MultipartFile file) {
        try {
            InputStream io = file.getInputStream();
            Qiniu qiniu = qiniuUtil.uploads(io);
            //插入数据库
            Img img = new Img();

            Map<String, Object> map = new HashMap<>();

            img.setName(qiniu.getKey());
            img.setUrl(host + qiniu.getKey());
            img.setStatus(true);
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            img.setCreatetime(timestamp);
            imgService.insert(img);

            map.put("code","0");
            map.put("msg","上传成功！");
            map.put("id",img.getId());
            map.put("name",qiniu.getKey());
            map.put("url",host + qiniu.getKey());

            return map;

        }catch(Exception e){
            Map<String, Object> map = new HashMap<>();
            map.put("code","1");
            map.put("msg","上传失败！");
            return map;
        }
    }

    /**
     * 删除七牛云图片
     * @param key
     * @return
     */
    @RequestMapping(value = "deleteById", method = RequestMethod.DELETE)
    public Map<String, Object> delete(@RequestParam("name") String key) {
        try {
            Map<String, Object> map = new HashMap<>();

            qiniuUtil.delete(key);
            imgService.deleteByName(key);

            map.put("code","0");
            map.put("name",key);
            map.put("msg","删除成功！");
            return map;

        }catch(Exception e){
            Map<String, Object> map = new HashMap<>();
            map.put("code","1");
            map.put("msg","删除失败！");
            return map;
        }
    }

    /*@RequestMapping(value = "move", method = RequestMethod.PUT)
    public Map<String, Object> update(
                                    @PathVariable("fromKey") String fromKey,
                                    @PathVariable("toKey") String toKey) throws QiniuException {
        try {
            Map<String, Object> map = new HashMap<>();
            qiniuUtil.update(fromKey, toKey);
            map.put("code","0");
            map.put("name",fromKey);
            map.put("msg","更新成功！");
            return map;
        }catch(Exception e){
            Map<String, Object> map = new HashMap<>();
            map.put("code","1");
            map.put("msg","更新失败！");
            return map;
        }

    }*/


    /*public Response<String> uploads(@RequestParam("file") MultipartFile file) {
        Response<String> resp = new Response<>(ResponseEnum.Success);
        try {
            InputStream io = file.getInputStream();
            Qiniu qiniu = qiniuUtil.uploads(io);
            resp.setData(host + qiniu.getKey());
            //插入数据库
            Img img = new Img();
            img.setPath(host + qiniu.getKey());
            img.setStatus(true);
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            img.setCreatetime(timestamp);

            imgService.insert(img);

        }catch(Exception e){
            resp.setResponse(ResponseEnum.Fail);
        }
        return resp;
    }*/


    /*@RequestMapping(value = "/uploadimg", method = RequestMethod.POST)
    public Map<String, Object> uploadImg(@RequestParam("file") MultipartFile file,HttpServletRequest request) {

        // 先判断文件是否为空
        if (!file.isEmpty()) {
            // 获得原始文件名
            String fileName = file.getOriginalFilename();
            logger.info(fileName);
            //获取日期
            SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd");
            Date date = new Date();
            String fileDate= sdf.format(date);
            // 重命名文件
            //String newfileName = new Date().getTime() + String.valueOf(fileName);
            //获得物理路径webapp所在路径
            String pathRoot = request.getSession().getServletContext().getRealPath("");
            logger.info(pathRoot);
            // 项目下相对路径
            String FILE_PATH = "/upload/image/";
            String filepath = FILE_PATH + fileDate +"/"+ fileName;
            logger.info(filepath);
            // 创建文件实例
            File tempFile = new File(pathRoot+filepath);
            // 判断父级目录是否存在，不存在则创建
            if (!tempFile.getParentFile().exists()) {
                tempFile.getParentFile().mkdir();
            }
            // 判断文件是否存在，否则创建文件（夹）
            if (!tempFile.exists()) {
                tempFile.mkdir();
            }

            try {
                // 将接收的文件保存到指定文件中
                file.transferTo(tempFile);
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }


            /*StringBuffer url = new StringBuffer();
            SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd");
            Date date = new Date();
            String filePath = path + sdf.format(date);
            logger.info(filePath);
            String pathRoot = req.getSession().getServletContext().getRealPath("");
            // 项目下相对路径
            String path = FILE_PATH + newfileName;*/

      /*  }




        /*String imgFolderPath = req.getServletContext().getRealPath(filePath);
        logger.info(imgFolderPath);
        File imgFolder = new File(imgFolderPath);
        if (!imgFolder.exists()) {
            imgFolder.mkdirs();
        }
        url.append(req.getScheme())
                .append("://")
                .append(req.getServerName())
                .append(":")
                .append(req.getServerPort())
                .append(req.getContextPath())
                .append(filePath);
        String imgName = UUID.randomUUID() + "_" + image.getOriginalFilename().replaceAll(" ", "");
        try {
            FileOutputStream fos = new FileOutputStream(new File(imgFolder, imgName));
            fos.write(image.getBytes());
            url.append("/").append(imgName);
            Map<String, Object> map = new HashMap<>();
            map.put("success", url.toString());
            logger.info(url.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }*/

       /* Map<String, Object> map = new HashMap<>();
        map.put("error", "上传失败!");
        return map;
    }*/

            /*if(!file.isEmpty()){

            try {

                BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(new File(file.getOriginalFilename())));

                out.write(file.getBytes());

                out.flush();

                out.close();

            } catch (FileNotFoundException e) {

                e.printStackTrace();

                return"上传失败,"+e.getMessage();

            } catch (IOException e) {

                e.printStackTrace();

                return"上传失败,"+e.getMessage();

            }

            return"上传成功";

        }else{

            return"上传失败，因为文件是空的.";

        }*/


}
