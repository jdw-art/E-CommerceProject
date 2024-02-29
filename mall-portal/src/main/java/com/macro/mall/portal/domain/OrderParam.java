package com.macro.mall.portal.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @Author: Jacob
 * @Description: TODO 生成订单时传入的参数
 * @Date: 2024/2/29 16:24
 * @Version: 1.0
 */
@Getter
@Setter
public class OrderParam {
    @ApiModelProperty("收货地址ID")
    private Long memberReceiverAddressId;
    @ApiModelProperty("优惠券ID")
    private Long couponId;
    @ApiModelProperty("使用的积分数")
    private Integer useIntegration;
    @ApiModelProperty("支付方式")
    private Integer payType;
    @ApiModelProperty("被选中的购物车商品ID")
    private List<Long> cartIds;
}
