package com.macro.mall.portal.domain;

import com.macro.mall.model.PmsProduct;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @Author: Jacob
 * @Description: TODO 秒杀信息和商品对象封装
 * @Date: 2024/2/28 10:53
 * @Version: 1.0
 */
@Getter
@Setter
public class FlashPromotionProduct extends PmsProduct {
    @ApiModelProperty("秒杀几个")
    private BigDecimal flashPromotionPrice;
    @ApiModelProperty("用于秒杀的数量")
    private Integer flashPromotionCount;
    @ApiModelProperty("秒杀限购数量")
    private Integer flashPromotionLimit;
}
