package com.macro.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @Author: Jacob
 * @Description: 文件上传返回结果
 * @Date: 2024/3/6 15:35
 * @Version: 1.0
 */
@Data
@EqualsAndHashCode
public class MinioUploadDto {
    @ApiModelProperty("文件访问url")
    private String url;
    @ApiModelProperty("文件名称")
    private String name;
}
