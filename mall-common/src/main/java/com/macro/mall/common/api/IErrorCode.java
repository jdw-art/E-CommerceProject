package com.macro.mall.common.api;

/**
 * @Author: Jacob
 * @Description: TODO API返回码接口
 * @Date: 2024/2/20 16:38
 * @Version: 1.0
 */
public interface IErrorCode {
    /**
     * 返回码
     */
    long getCode();

    /**
     * 返回信息
     */
    String getMessage();
}
