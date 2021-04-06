package com.yzu.latte.common.result;

/**
 * API常用操作码
 */
public enum ResultCode implements IErrorCode {

    SUCCESS(200, "SUCCESS"),

    FAILED(500, "FAILURE"),

    VALIDATE_FAILED(404, "Parameter verification failed"),

    UNAUTHORIZED(401, "Not logged in yet or token has expired"),

    FORBIDDEN(403, "Without relevant permission");

    private long code;

    private String message;

    ResultCode(long code, String message) {
        this.code = code;
        this.message = message;
    }

    public long getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}

