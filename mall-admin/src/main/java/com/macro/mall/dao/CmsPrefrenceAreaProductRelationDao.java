package com.macro.mall.dao;

import com.macro.mall.model.CmsPrefrenceAreaProductRelation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: Jacob
 * @Description: TODO 优选和商品关系自定义Dao
 * @Date: 2024/2/23 20:51
 * @Version: 1.0
 */
public interface CmsPrefrenceAreaProductRelationDao {

    /**
     * 批量创建
     */
    int insertList(@Param("list") List<CmsPrefrenceAreaProductRelation> prefrenceAreaProductRelationList);
}
