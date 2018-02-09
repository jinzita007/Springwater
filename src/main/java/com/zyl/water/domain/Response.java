package com.zyl.water.domain;

import com.zyl.water.common.enums.ResponseEnum;

/**
 * 响应类
 */
public class Response<T>{
    // 响应码
    private String code;

    // 响应信息
    private String message;

    // 调用结果
    private boolean success;

    // 传输实体
    private T data;

    // 返回枚举
    private ResponseEnum response;

    public Response(String code, String message, boolean success, T data) {
        super();
        this.code = code;
        this.message = message;
        this.success = success;
        this.data = data;
    }

    public Response(String code, String message, boolean success) {
        super();
        this.code = code;
        this.message = message;
        this.success = success;
    }

    public Response(ResponseEnum response) {
        super();
        this.success = response.isSuccess();
        this.message = response.getMsg();
        this.code = response.getCode();
    }

    public Response(ResponseEnum response,T data) {
        super();
        this.success = response.isSuccess();
        this.message = response.getMsg();
        this.code = response.getCode();
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     *
     * @Title: isSuccess
     *
     * @Description: 返回调用是否成功
     *
     * @return: boolean
     *
     */
    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ResponseEnum getResponse() {
        return response;
    }

    public void setResponse(ResponseEnum response) {
        this.response = response;
    }




}
