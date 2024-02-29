package com.macro.mall.dao;

import com.macro.mall.model.OmsOrderOperateHistory;

import java.util.List;

/**
 * @Author: Jacob
 * @Description: 订单操作记录自定义Dao
 * @Date: 2024/2/28 16:19
 * @Version: 1.0
 */
public interface OmsOrderOperateHistoryDao {

    /**
     * 批量创建
     */
    int insertList(List<OmsOrderOperateHistory> orderOperateHistoryList);
}
