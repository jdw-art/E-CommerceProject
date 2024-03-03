package com.macro.mall.dto;

import com.macro.mall.model.PmsProduct;
import com.macro.mall.model.SmsFlashPromotionProductRelation;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @Author: Jacob
 * @Description: 限时购商品信息封装类
 * @Date: 2024/3/3 21:35
 * @Version: 1.0
 */
public class SmsFlashPromotionProduct extends SmsFlashPromotionProductRelation {
    @Getter
    @Setter
    @ApiModelProperty("关联商品")
    private PmsProduct product;
}
