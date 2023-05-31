package org.apache.dubbo.springboot.demo.exception;


public class ApplicationException extends RuntimeException {
    private static final long serialVersionUID = -6118529754180362427L;

    /**
     * 异常码
     */
    private final String code;

    public String getCode() {
        return code;
    }

    public ApplicationException() {
        super(GlobalStatusEnum.SERVER_ERROR.getMsg());
        this.code = GlobalStatusEnum.SERVER_ERROR.getCode();
    }

    public ApplicationException(String code, String message) {
        super(message);
        this.code = code;
    }

    public ApplicationException(String message) {
        super(message);
        this.code = GlobalStatusEnum.SERVER_ERROR.getCode();
    }

    public ApplicationException(GlobalStatusEnum globalStatusEnum) {
        super(globalStatusEnum.getMsg());
        this.code = globalStatusEnum.getCode();
    }

    public ApplicationException(Exception exception) {
        super(exception.getMessage());
        this.code = exception instanceof ApplicationException ? ((ApplicationException) exception).getCode() : GlobalStatusEnum.BUSINESS_EXCEPTION.getCode();
    }
}
