package com.macro.mall.dao;

import com.macro.mall.dto.SmsCouponParam;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: Jacob
 * @Description: 优惠券管理自定义Dao
 * @Date: 2024/3/4 11:06
 * @Version: 1.0
 */
public interface SmsCouponDao {
    /**
     * 获取优惠券详情包括绑定关系
     */
    SmsCouponParam getItem(@Param("id") Long id);
}
