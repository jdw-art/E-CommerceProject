package com.macro.mall.dao;

import com.macro.mall.model.PmsProductFullReduction;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: Jacob
 * @Description: TODO 商品满减自定义Dao
 * @Date: 2024/2/23 20:42
 * @Version: 1.0
 */
public interface PmsProductFullReductionDao {

    /**
     * 批量创建
     */
    int insertList(@Param("list") List<PmsProductFullReduction> productFullReductionList);
}
