package com.macro.mall.dao;

import com.macro.mall.model.CmsSubjectProductRelation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: Jacob
 * @Description: TODO 商品和专题关系自定义Dao
 * @Date: 2024/2/23 20:49
 * @Version: 1.0
 */
public interface CmsSubjectProductRelationDao {

    /**
     * 批量创建
     */
    int insertList(@Param("list") List<CmsSubjectProductRelation> subjectProductRelationList);
}
