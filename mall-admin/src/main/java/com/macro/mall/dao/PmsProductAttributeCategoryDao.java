package com.macro.mall.dao;

import com.macro.mall.dto.PmsProductAttributeCategoryItem;

import java.util.List;

/**
 * @Author: Jacob
 * @Description: TODO 商品属性分类管理自定义Dao
 * @Date: 2024/2/27 14:12
 * @Version: 1.0
 */
public interface PmsProductAttributeCategoryDao {
    /**
     * 获取包含属性的商品属性分类
     */
    List<PmsProductAttributeCategoryItem> getListWithAttr();
}
