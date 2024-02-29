package com.macro.mall.dao;

import com.macro.mall.model.PmsProductLadder;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: Jacob
 * @Description: TODO 会员阶梯价格自定义Dao
 * @Date: 2024/2/23 20:39
 * @Version: 1.0
 */
public interface PmsProductLadderDao {

    /**
     * 批量创建
     */
    int insertList(@Param("list") List<PmsProductLadder> productLadderList);
}
