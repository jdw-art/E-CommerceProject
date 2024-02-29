package com.macro.mall.service;

import com.macro.mall.model.UmsMemberLevel;

import java.util.List;

/**
 * @Author: Jacob
 * @Description: TODO 会员等级管理Service
 * @Date: 2024/2/22 16:47
 * @Version: 1.0
 */
public interface UmsMemberLevelService {
    /**
     * 获取所有会员等级
     * @param defaultStatus 是否为默认会员
     * @return
     */
    List<UmsMemberLevel> list(Integer defaultStatus);
}
