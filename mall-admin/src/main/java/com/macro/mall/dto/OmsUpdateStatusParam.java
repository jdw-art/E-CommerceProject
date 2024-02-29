package com.macro.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @Author: Jacob
 * @Description: 确认收获请求参数
 * @Date: 2024/2/28 18:47
 * @Version: 1.0
 */
@Getter
@Setter
public class OmsUpdateStatusParam {
    @ApiModelProperty(value = "服务单号")
    private Long id;
    @ApiModelProperty(value = "收获地址关联ID")
    private Long companyAddressId;
    @ApiModelProperty(value = "确认退款金额")
    private BigDecimal returnAmount;
    @ApiModelProperty(value = "处理备注")
    private String handleNote;
    @ApiModelProperty(value = "处理人员")
    private String handleMan;
    @ApiModelProperty(value = "收货备注")
    private String receiveNote;
    @ApiModelProperty(value = "收货人员")
    private String receiveMan;
    @ApiModelProperty(value = "申请状态：1->退货中；2->已完成；3->已拒绝")
    private Integer status;
}
