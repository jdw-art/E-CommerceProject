package com.macro.mall.service;

import com.macro.mall.model.OmsCompanyAddress;

import java.util.List;

/**
 * @Author: Jacob
 * @Description: 收货地址管理Service
 * @Date: 2024/3/6 16:25
 * @Version: 1.0
 */
public interface OmsCompanyAddressService {

    /**
     * 获取全部收货地址
     */
    List<OmsCompanyAddress> list();
}
