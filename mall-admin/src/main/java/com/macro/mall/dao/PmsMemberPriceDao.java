package com.macro.mall.dao;

import com.macro.mall.model.PmsMemberPrice;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: Jacob
 * @Description: TODO 会员价格管理自定义Dao
 * @Date: 2024/2/23 20:36
 * @Version: 1.0
 */
public interface PmsMemberPriceDao {

    /**
     * 批量创建
     */
    int insertList(@Param("list") List<PmsMemberPrice> memberPriceList);
}
