package com.macro.mall.portal.dao;

import com.macro.mall.model.OmsOrderItem;

import java.util.List;

/**
 * @Author: Jacob
 * @Description: 订单商品信息管理自定义Dao
 * @Date: 2024/3/1 10:51
 * @Version: 1.0
 */
public interface PortalOrderItemDao {

    /**
     * 批量插入
     */
    int insertList(List<OmsOrderItem> list);
}
