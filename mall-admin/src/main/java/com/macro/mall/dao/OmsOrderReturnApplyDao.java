package com.macro.mall.dao;

import com.macro.mall.dto.OmsReturnApplyQueryParam;
import com.macro.mall.model.OmsOrderReturnApply;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: Jacob
 * @Description: 订单退货申请自定义Dao
 * @Date: 2024/2/28 18:53
 * @Version: 1.0
 */
public interface OmsOrderReturnApplyDao {

    /**
     * 查询申请列表
     */
    List<OmsOrderReturnApply> getList(@Param("queryParam") OmsReturnApplyQueryParam queryParam);

    /**
     * 获取申请详情
     */
    OmsOrderReturnApply getDetail(@Param("id") Long id);
}
