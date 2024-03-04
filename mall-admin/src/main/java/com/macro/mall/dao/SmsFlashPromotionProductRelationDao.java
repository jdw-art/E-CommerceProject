package com.macro.mall.dao;

import com.macro.mall.dto.SmsFlashPromotionProduct;

import java.util.List;

/**
 * @Author: Jacob
 * @Description: 限时购商品关系管理自定义Dao
 * @Date: 2024/3/4 9:45
 * @Version: 1.0
 */
public interface SmsFlashPromotionProductRelationDao {

    /**
     * 获取限时购及相关商品信息
     * @param flashPromotionId              限时购ID
     * @param flashPromotionSessionId       限时购场次ID
     * @return
     */
    List<SmsFlashPromotionProduct> getList(Long flashPromotionId, Long flashPromotionSessionId);
}
