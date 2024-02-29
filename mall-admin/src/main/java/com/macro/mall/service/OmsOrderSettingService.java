package com.macro.mall.service;

import com.macro.mall.model.OmsOrderSetting;

/**
 * @Author: Jacob
 * @Description: 订单设置管理Service
 * @Date: 2024/2/28 18:32
 * @Version: 1.0
 */
public interface OmsOrderSettingService {

    /**
     * 获取指定订单设置
     */
    OmsOrderSetting getItem(Long id);

    /**
     * 修改指定订单设置
     */
    int update(Long id, OmsOrderSetting orderSetting);
}
