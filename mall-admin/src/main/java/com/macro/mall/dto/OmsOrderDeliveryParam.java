package com.macro.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @Author: Jacob
 * @Description: 订单发货参数
 * @Date: 2024/2/28 15:50
 * @Version: 1.0
 */
@Getter
@Setter
public class OmsOrderDeliveryParam {
    @ApiModelProperty(value = "订单ID")
    private Long orderId;
    @ApiModelProperty(value = "物流公司")
    private String deliveryCompany;
    @ApiModelProperty(value = "物流单号")
    private String deliverySn;
}
