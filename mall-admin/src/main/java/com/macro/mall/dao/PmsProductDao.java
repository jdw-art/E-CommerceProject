package com.macro.mall.dao;

import com.macro.mall.dto.PmsProductResult;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: Jacob
 * @Description: TODO 商品管理自定义Dao
 * @Date: 2024/2/23 20:53
 * @Version: 1.0
 */
public interface PmsProductDao {

    /**
     * 获取商品编辑信息
     */
    PmsProductResult getUpdateInfo(@Param("id") Long id);
}
