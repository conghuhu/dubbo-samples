package org.apache.dubbo.springboot.demo.exception;

public enum GlobalStatusEnum {

    /**
     * server error
     */
    SERVER_ERROR("server error", "500"),

    /**
     * business error
     */
    BUSINESS_EXCEPTION("bussiness error", "501");

    String msg;

    String code;

    public String getMsg() {
        return msg;
    }

    public String getCode() {
        return code;
    }

    GlobalStatusEnum(String msg, String code) {
        this.msg = msg;
        this.code = code;
    }
}
