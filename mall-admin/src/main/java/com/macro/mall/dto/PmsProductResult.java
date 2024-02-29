package com.macro.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @Author: Jacob
 * @Description: TODO
 * @Date: 2024/2/23 20:22
 * @Version: 1.0
 */
public class PmsProductResult extends PmsProductParam{
    @Getter
    @Setter
    @ApiModelProperty("商品所选分类的父ID")
    private Long cateParentId;
}
