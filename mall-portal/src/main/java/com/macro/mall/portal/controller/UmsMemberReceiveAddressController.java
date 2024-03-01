package com.macro.mall.portal.controller;

import com.macro.mall.common.api.CommonResult;
import com.macro.mall.model.UmsMemberReceiveAddress;
import com.macro.mall.portal.service.UmsMemberReceiveAddressService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: Jacob
 * @Description: 会员收货地址管理Controller
 * @Date: 2024/3/1 12:47
 * @Version: 1.0
 */
@Controller
@Api(tags = "UmsMemberReceiveAddressController")
@Tag(name = "UmsMemberReceiveAddressController", description = "会员收货地址管理")
@RequestMapping(value = "/member/address")
public class UmsMemberReceiveAddressController {

    @Autowired
    private UmsMemberReceiveAddressService memberReceiveAddressService;

    @ApiOperation(value = "添加收货地址")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult add(@RequestBody UmsMemberReceiveAddress memberReceiveAddress) {
        int count = memberReceiveAddressService.add(memberReceiveAddress);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation(value = "删除会员收货地址")
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult delete(@PathVariable Long id) {
        int count = memberReceiveAddressService.delete(id);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation(value = "修改收货地址")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult update(@PathVariable Long id, @RequestBody UmsMemberReceiveAddress memberReceiveAddress) {
        int count = memberReceiveAddressService.update(id, memberReceiveAddress);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation(value = "显示所有收货地址")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<UmsMemberReceiveAddress>> list() {
        List<UmsMemberReceiveAddress> addressList = memberReceiveAddressService.list();
        return CommonResult.success(addressList);
    }

    @ApiOperation(value = "获取收货地址详情")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<UmsMemberReceiveAddress> getItem(@PathVariable Long id) {
        UmsMemberReceiveAddress address = memberReceiveAddressService.getItem(id);
        return CommonResult.success(address);
    }
}
