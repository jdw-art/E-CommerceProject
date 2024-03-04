package com.macro.mall.dto;

import com.macro.mall.model.SmsFlashPromotionSession;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @Author: Jacob
 * @Description: 包含商品数量的场次信息
 * @Date: 2024/3/4 10:16
 * @Version: 1.0
 */
public class SmsFlashPromotionSessionDetail extends SmsFlashPromotionSession {
    @Getter
    @Setter
    @ApiModelProperty("商品数量")
    private Long productCount;
}
