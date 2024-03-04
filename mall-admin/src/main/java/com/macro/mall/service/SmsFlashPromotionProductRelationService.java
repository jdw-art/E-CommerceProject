package com.macro.mall.service;

import com.macro.mall.dto.SmsFlashPromotionProduct;
import com.macro.mall.model.SmsFlashPromotionProductRelation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author: Jacob
 * @Description: 限时购商品关联管理Service
 * @Date: 2024/3/3 21:32
 * @Version: 1.0
 */
public interface SmsFlashPromotionProductRelationService {

    /**
     * 批量添加关联
     */
    @Transactional
    int create(List<SmsFlashPromotionProductRelation> relationList);

    /**
     * 修改关联信息
     */
    int update(Long id, SmsFlashPromotionProductRelation relation);

    /**
     * 删除关联
     */
    int delete(Long id);

    /**
     * 获取关联信息
     */
    SmsFlashPromotionProductRelation getItem(Long id);

    /**
     * 分页查询相关商品及限时购促销信息
     * @param flashPromotionId          限时购ID
     * @param flashPromotionSessionId   限时购场次ID
     * @param pageSize
     * @param pageNum
     * @return
     */
    List<SmsFlashPromotionProduct> list(Long flashPromotionId, Long flashPromotionSessionId, Integer pageSize, Integer pageNum);

    /**
     * 根据活动和场次ID获取商品关系数量
     * @param flashPromotionId          限时购id
     * @param flashPromotionSessionId   限时购场次id
     * @return
     */
    long getCount(Long flashPromotionId, Long flashPromotionSessionId);
}
