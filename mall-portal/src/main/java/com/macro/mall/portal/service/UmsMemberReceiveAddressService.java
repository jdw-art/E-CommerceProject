package com.macro.mall.portal.service;

import com.macro.mall.model.UmsMemberReceiveAddress;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author: Jacob
 * @Description: 用户地址管理Service
 * @Date: 2024/2/29 20:45
 * @Version: 1.0
 */
public interface UmsMemberReceiveAddressService {

    /**
     * 添加收获地址
     */
    int add(UmsMemberReceiveAddress memberReceiveAddress);

    /**
     * 删除收货地址
     * @param id 地址表的id
     * @return
     */
    int delete(Long id);

    /**
     * 修改收货地址
     * @param id 地址表的id
     * @param address 修改的收货地址信息
     * @return
     */
    @Transactional
    int update(Long id, UmsMemberReceiveAddress address);

    /**
     * 返回当前用户的收货地址
     */
    List<UmsMemberReceiveAddress> list();

    /**
     * 返回当前用户的收货地址
     * @param id 当前用户的id
     * @return
     */
    UmsMemberReceiveAddress getItem(Long id);
}
