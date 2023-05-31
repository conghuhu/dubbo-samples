package org.apache.dubbo.springboot.demo.exception;

public class BusinessException extends ApplicationException {

    public BusinessException() {
        super(GlobalStatusEnum.BUSINESS_EXCEPTION);
    }

    public BusinessException(String message) {
        super(GlobalStatusEnum.BUSINESS_EXCEPTION.getCode(), message);
    }

    public BusinessException(String code, String message) {
        super(code, message);
    }

    public BusinessException(GlobalStatusEnum globalStatus) {
        super(globalStatus);
    }
}
