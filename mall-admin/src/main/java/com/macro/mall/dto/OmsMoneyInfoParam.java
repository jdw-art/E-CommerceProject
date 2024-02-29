package com.macro.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @Author: Jacob
 * @Description: 修改订单费用信息参数
 * @Date: 2024/2/28 16:09
 * @Version: 1.0
 */
@Getter
@Setter
public class OmsMoneyInfoParam {
    @ApiModelProperty(value = "订单ID")
    private Long orderId;
    @ApiModelProperty(value = "运费金额")
    private BigDecimal freightAmount;
    @ApiModelProperty(value = "管理员后台调整订单所使用的折扣金额")
    private BigDecimal discountAmount;
    @ApiModelProperty(value = "订单状态：0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单")
    private Integer status;
}
