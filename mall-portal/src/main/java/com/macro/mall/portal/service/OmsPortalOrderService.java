package com.macro.mall.portal.service;

import com.macro.mall.portal.domain.ConfirmOrderResult;

import java.util.List;
import java.util.Map;

/**
 * @Author: Jacob
 * @Description: TODO 前台订单管理Service
 * @Date: 2024/2/29 16:13
 * @Version: 1.0
 */
public interface OmsPortalOrderService {

    /**
     * 根据用户购物车信息生成确认单信息
     */
    ConfirmOrderResult generateConfirmOrder(List<Long> ids);

    /**
     * 根据提交信息生成订单
     */
    Map<String, Object> generateOrder()
}
