package com.macro.mall.portal.service;

import com.macro.mall.portal.domain.OmsOrderReturnApplyParam;

/**
 * @Author: Jacob
 * @Description: 前台订单退货管理Service
 * @Date: 2024/3/5 10:08
 * @Version: 1.0
 */
public interface OmsPortalOrderReturnApplyService {

    /**
     * 提交申请
     */
    int create(OmsOrderReturnApplyParam returnApplyParam);
}
