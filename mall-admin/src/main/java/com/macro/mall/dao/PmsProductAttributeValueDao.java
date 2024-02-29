package com.macro.mall.dao;

import com.macro.mall.model.PmsProductAttributeValue;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: Jacob
 * @Description: TODO 商品属性值管理自定义Dao
 * @Date: 2024/2/23 20:47
 * @Version: 1.0
 */
public interface PmsProductAttributeValueDao {

    /**
     * 批量创建
     */
    int insertList(@Param("list") List<PmsProductAttributeValue> productAttributeValueList);
}
