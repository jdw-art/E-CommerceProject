package com.macro.mall.dao;

import com.macro.mall.dto.PmsProductCategoryWithChildrenItem;

import java.util.List;

/**
 * @Author: Jacob
 * @Description: TODO 商品自定义Dao
 * @Date: 2024/2/27 10:29
 * @Version: 1.0
 */
public interface PmsProductCategoryDao {

    /**
     * 获取商品分类及其子分类
     */
    List<PmsProductCategoryWithChildrenItem> listWithChildren();
}
