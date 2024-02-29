package com.macro.mall.dao;

import com.macro.mall.model.PmsSkuStock;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: Jacob
 * @Description: TODO 商品SKU管理自定义Dao
 * @Date: 2024/2/23 20:44
 * @Version: 1.0
 */
public interface PmsSkuStockDao {

    /**
     * 批量插入操作
     */
    int insertList(@Param("list") List<PmsSkuStock> skuStockList);

    /**
     * 批量插入或替换操作
     */
    int replaceList(List<PmsSkuStock> skuStockList);
}
