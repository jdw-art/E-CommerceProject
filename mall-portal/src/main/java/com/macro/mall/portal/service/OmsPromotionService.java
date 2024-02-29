package com.macro.mall.portal.service;

import com.macro.mall.model.OmsCartItem;
import com.macro.mall.portal.domain.CartPromotionItem;

import java.util.List;

/**
 * @Author: Jacob
 * @Description: 促销管理Service
 * @Date: 2024/2/28 20:01
 * @Version: 1.0
 */
public interface OmsPromotionService {

    /**
     * 计算购物车中的促销活动信息
     * @param cartItemList
     * @return
     */
    List<CartPromotionItem> calcCartPromotion(List<OmsCartItem> cartItemList);
}
