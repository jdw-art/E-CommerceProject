package com.macro.mall.dao;

import com.macro.mall.model.PmsProductVertifyRecord;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: Jacob
 * @Description: TODO 商品审核日志管理自定义Dao
 * @Date: 2024/2/23 20:58
 * @Version: 1.0
 */
public interface PmsProductVertifyRecordDao {

    /**
     * 批量创建
     */
    int insertList(@Param("list") List<PmsProductVertifyRecord> list);
}
