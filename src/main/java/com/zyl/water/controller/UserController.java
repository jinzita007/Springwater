package com.zyl.water.controller;

import com.alibaba.fastjson.JSONObject;
import com.zyl.water.domain.Msg;
import com.zyl.water.domain.User;
import com.zyl.water.mapper.UserMapper;
import com.zyl.water.service.UserService;
import com.zyl.water.util.MD5Utils;
import com.zyl.water.util.ResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import javax.servlet.http.HttpSession;
import java.sql.Timestamp;
import java.util.List;

/**
 * Created by zhouyulong on 2018/2/1.
 */
@RestController
@Api(description = "用户管理")
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    UserService userService;

    /**
     * 用户登录
     * @param user
     * @return
     */
    @ApiOperation(value="用户登录", notes="用户登录")
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Object login(User user, HttpSession session) {
        try {
            //通过用户名获取用户
            User userResult = userService.getUser(user);

            if (userResult == null) {
                return ResultUtil.error(202,"该用户名没有注册");
            } else {
                String password = MD5Utils.MD5Encode(user.getPassword(),"utf8");
                //如果密码正确则登录成功
                //让传入用户的属性和数据库保持一致
                if (userResult.getPassword().equals(password)) {
                    //将用户信息放到session中
                    session.setAttribute("user", userResult);
                    //设置session存储时间，以秒为单位
                    session.setMaxInactiveInterval(3600);
                    JSONObject jsonObject = new JSONObject();
                    jsonObject.put("code",200);
                    jsonObject.put("msg", "请求成功");
                    jsonObject.put("user", userResult.getUsername());
                    return jsonObject;
                } else {
                    return ResultUtil.error(203, "密码错误");
                }
            }
        } catch (Exception e) {
            return ResultUtil.error(400, "出现异常");
        }
    }

    /**
     * 注销
     * @param session
     * @return
     */
    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public Msg logout(HttpSession session) {
        //从session中删除suer属性，用户退出登录
        session.removeAttribute("user");
        return ResultUtil.success();
    }

    /**
     * 获取用户列表
     * @return
     */
    @ApiOperation(value="获取用户列表", notes="获取用户列表")
    @RequestMapping(value = "all", method = RequestMethod.GET)
    public List<User> findAll() {
        return userService.findAll();
    }

    /**
     * 新增用户
     * @param user
     * @return
     */
    @ApiOperation(value="新增一个用户", notes="新增一个用户")
    @RequestMapping(value = "users", method = RequestMethod.POST)
    public Object addUser(User user) {

        userService.addUser(user);

        JSONObject jsonObject = new JSONObject();

        jsonObject.put("msg","插入成功！");
        jsonObject.put("data",user);

        return jsonObject;

    }

    /**
     * 更新一个用户名
     * @param id
     * @param username
     * @param password
     * @param email
     * @param mobile
     * @param status
     * @return
     */
    @ApiOperation(value="更新一个用户", notes="更新一个用户")
    @RequestMapping(value = "users/{id}", method = RequestMethod.PUT)
    public String updateUser(@PathVariable("id") Long id,
                             @RequestParam("username") String username,
                             @RequestParam("password") String password,
                             @RequestParam("email") String email,
                             @RequestParam("mobile") String mobile,
                             @RequestParam("status") Boolean status) {
        // 处理"/users/{id}"的PUT请求，用来更新User信息
        User user = new User();
        user.setId(id);
        user.setUsername(username);
        user.setPassword(password);
        user.setEmail(email);
        user.setMobile(mobile);
        user.setStatus(status);
        //生成时间
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        user.setUpdate_time(timestamp);

        userService.updateUser(user);

        return "success";

    }

    /**
     * 删除用户名
     * @param id
     */
    @ApiOperation(value="删除用户名", notes="删除用户名")
    @RequestMapping(value = "users/{id}",method = RequestMethod.DELETE)
    public void removeUser(@PathVariable("id") Long id) {
        userService.removeUser(id);
    }



}
