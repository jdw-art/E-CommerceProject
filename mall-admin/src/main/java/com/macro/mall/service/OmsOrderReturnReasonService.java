package com.macro.mall.service;

import com.macro.mall.model.OmsOrderReturnReason;

import java.util.List;

/**
 * @Author: Jacob
 * @Description: 退货原因管理Service
 * @Date: 2024/2/28 19:18
 * @Version: 1.0
 */
public interface OmsOrderReturnReasonService {

    /**
     * 添加退货原因
     */
    int create(OmsOrderReturnReason returnReason);

    /**
     * 修改退货原因
     */
    int update(Long id, OmsOrderReturnReason returnReason);

    /**
     * 批量删除退货原因
     */
    int delete(List<Long> ids);

    /**
     * 分页获取退货原因
     */
    List<OmsOrderReturnReason> list(Integer pageSize, Integer pageNum);

    /**
     * 批量修改退货原因状态
     */
    int updateStatus(List<Long> ids, Integer status);

    /**
     * 获取单个退货详情原因
     */
    OmsOrderReturnReason getItem(Long id);
}
