package com.macro.mall.portal.service;

import com.macro.mall.model.CmsSubject;
import com.macro.mall.model.PmsProduct;
import com.macro.mall.model.PmsProductCategory;
import com.macro.mall.portal.domain.HomeContentResult;

import java.util.List;

/**
 * @Author: Jacob
 * @Description: 首页内容管理Service
 * @Date: 2024/3/4 16:06
 * @Version: 1.0
 */
public interface HomeService {

    /**
     * 获取首页内容
     */
    HomeContentResult content();

    /**
     * 首页商品推荐
     */
    List<PmsProduct> recommendProductList(Integer pageSize, Integer pageNum);

    /**
     * 获取商品分类
     * @param parentId  0:获取一级分类；其他：获取指定二级分类
     * @return
     */
    List<PmsProductCategory> getProductCategoryList(Long parentId);

    /**
     * 根据专题分类分页获取专题
     * @param cateId        专题分类id
     * @param pageSize
     * @param pageNum
     * @return
     */
    List<CmsSubject> getSubjectList(Long cateId, Integer pageSize, Integer pageNum);

    /**
     * 分页获取人气推荐商品
     */
    List<PmsProduct> hotProductList(Integer pageNum, Integer pageSize);

    /**
     * 分页获取新品推荐商品
     */
    List<PmsProduct> newProductList(Integer pageNum, Integer pageSize);
}
