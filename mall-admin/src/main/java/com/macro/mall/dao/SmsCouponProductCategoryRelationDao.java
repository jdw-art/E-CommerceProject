package com.macro.mall.dao;

import com.macro.mall.model.SmsCouponProductCategoryRelation;

import java.util.List;

/**
 * @Author: Jacob
 * @Description: 优惠券和商品分类关系自定义Dao
 * @Date: 2024/3/4 11:03
 * @Version: 1.0
 */
public interface SmsCouponProductCategoryRelationDao {

    /**
     * 批量创建
     */
    int insertList(List<SmsCouponProductCategoryRelation> productCategoryRelationList);
}
