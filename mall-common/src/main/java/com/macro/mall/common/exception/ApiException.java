package com.macro.mall.common.exception;

import com.macro.mall.common.api.IErrorCode;

/**
 * @Author: Jacob
 * @Description: TODO 自定义API异常
 * @Date: 2024/2/20 17:25
 * @Version: 1.0
 */
public class ApiException extends RuntimeException{
    private IErrorCode errorCode;

    public ApiException(IErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

    public ApiException(String message) {
        super(message);
    }

    public ApiException(Throwable cause) {
        super(cause);
    }

    public ApiException(String message, Throwable cause) {
        super(message, cause);
    }

    public IErrorCode getErrorCode() {
        return errorCode;
    }
}
