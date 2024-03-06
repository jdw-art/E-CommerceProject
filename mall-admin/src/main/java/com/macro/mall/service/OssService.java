package com.macro.mall.service;

import com.macro.mall.dto.OssCallbackResult;
import com.macro.mall.dto.OssPolicyResult;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: Jacob
 * @Description: Oss对象存储管理Service
 * @Date: 2024/3/6 16:33
 * @Version: 1.0
 */
public interface OssService {
    /**
     * Oss上传策略生成
     */
    OssPolicyResult policy();

    /**
     * Oss上传成功回调
     */
    OssCallbackResult callback(HttpServletRequest request);
}
