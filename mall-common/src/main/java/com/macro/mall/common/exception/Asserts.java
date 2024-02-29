package com.macro.mall.common.exception;

import com.macro.mall.common.api.IErrorCode;

/**
 * @Author: Jacob
 * @Description: TODO 断言异常处理，用于抛出各种API异常
 * @Date: 2024/2/20 17:28
 * @Version: 1.0
 */
public class Asserts {
    public static void fail(String message) {
        throw new ApiException(message);
    }

    public static void fail(IErrorCode errorCode) {
        throw new ApiException(errorCode);
    }
}
