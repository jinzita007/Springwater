package com.zyl.water.util;

import com.zyl.water.domain.Msg;

/**
 * @author zhouyulong
 * @date 2018/11/30 上午9:22.
 */
public class ResultUtil {

    public static Msg success(Object object) {
        Msg msg = new Msg();
        msg.setCode(200);
        msg.setMsg("请求成功");
        msg.setData(object);
        return msg;
    }

    public static Msg success() {
        return success(null);
    }
    public static Msg error(Integer code, String resultmsg) {
        Msg msg = new Msg();
        msg.setCode(code);
        msg.setMsg(resultmsg);
        return msg;
    }

}
