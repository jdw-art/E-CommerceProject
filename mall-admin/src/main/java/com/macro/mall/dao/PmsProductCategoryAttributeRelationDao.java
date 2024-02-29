package com.macro.mall.dao;

import com.macro.mall.model.PmsProductCategoryAttributeRelation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: Jacob
 * @Description: TODO 商品分类和属性关系自定义Dao
 * @Date: 2024/2/27 10:26
 * @Version: 1.0
 */
public interface PmsProductCategoryAttributeRelationDao {

    /**
     * 批量创建
     */
    int insertList(@Param("list") List<PmsProductCategoryAttributeRelation> productCategoryAttributeRelationList);
}
