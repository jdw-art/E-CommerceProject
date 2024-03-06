package com.macro.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @Author: Jacob
 * @Description: OSS上传成功后的回调参数
 * @Date: 2024/3/6 16:53
 * @Version: 1.0
 */
@Data
@EqualsAndHashCode
public class OssCallbackParam {
    @ApiModelProperty("OSS回调地址")
    private String callbackUrl;
    @ApiModelProperty("回调时传入的request中的参数")
    private String callbackBody;
    @ApiModelProperty("回调时传入参数的格式，比如表单提交形式")
    private String callbackBodyType;
}
