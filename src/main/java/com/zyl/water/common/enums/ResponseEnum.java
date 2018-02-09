package com.zyl.water.common.enums;


public enum ResponseEnum {

    Success("0", "success"),Fail("1", "false");

    private String code;
    private String msg;


    ResponseEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public boolean isSuccess() {
        return Success.getCode().equals(this.code);
    }

    public static ResponseEnum get(String code) {
        for (ResponseEnum response : ResponseEnum.values()) {
            if (response.getCode().equals(code))
                return response;
        }
        throw new IllegalArgumentException("ResponseType is not exist : " + code);
    }
}
