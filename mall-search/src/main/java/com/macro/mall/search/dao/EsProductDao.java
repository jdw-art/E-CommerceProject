package com.macro.mall.search.dao;

import com.macro.mall.search.domain.EsProduct;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @Author: Jacob
 * @Description: 搜索商品管理自定义Dao
 * @Date: 2024/3/5 20:28
 * @Version: 1.0
 */
public interface EsProductDao {
    /**
     * 获取指定ID的搜索商品
     */
    List<EsProduct> getAllEsProductList(@Param("id") Long id);
}
