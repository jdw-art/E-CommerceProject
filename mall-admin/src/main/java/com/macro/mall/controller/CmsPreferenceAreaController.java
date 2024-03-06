package com.macro.mall.controller;

import com.macro.mall.common.api.CommonResult;
import com.macro.mall.model.CmsPrefrenceArea;
import com.macro.mall.service.CmsPreferenceAreaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author: Jacob
 * @Description: 商品优选管理Controller
 * @Date: 2024/3/6 16:19
 * @Version: 1.0
 */
@Controller
@Api(tags = "CmsPreferenceAreaController")
@Tag(name = "CmsPreferenceAreaController", description = "商品优选管理")
@RequestMapping("/prefrenceArea")
public class CmsPreferenceAreaController {

    @Autowired
    private CmsPreferenceAreaService preferenceAreaService;

    @ApiOperation(value = "获取所有商品优选")
    @RequestMapping(value = "/listAll", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<CmsPrefrenceArea>> listAll() {
        List<CmsPrefrenceArea> prefrenceAreaList = preferenceAreaService.listAll();
        return CommonResult.success(prefrenceAreaList);
    }
}
