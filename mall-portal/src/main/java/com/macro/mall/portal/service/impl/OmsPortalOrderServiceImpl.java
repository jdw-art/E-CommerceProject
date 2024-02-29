package com.macro.mall.portal.service.impl;

import com.macro.mall.common.api.CommonPage;
import com.macro.mall.portal.domain.ConfirmOrderResult;
import com.macro.mall.portal.domain.OmsOrderDetail;
import com.macro.mall.portal.domain.OrderParam;
import com.macro.mall.portal.service.OmsCartItemService;
import com.macro.mall.portal.service.OmsPortalOrderService;
import com.macro.mall.portal.service.UmsMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Author: Jacob
 * @Description: 前台订单管理Service实现类
 * @Date: 2024/2/29 20:43
 * @Version: 1.0
 */
@Service
public class OmsPortalOrderServiceImpl implements OmsPortalOrderService {

    @Autowired
    private UmsMemberService memberService;
    @Autowired
    private OmsCartItemService cartItemService;

    private Ums

    @Override
    public ConfirmOrderResult generateConfirmOrder(List<Long> ids) {
        return null;
    }

    @Override
    public Map<String, Object> generateOrder(OrderParam orderParam) {
        return null;
    }

    @Override
    public Integer paySuccess(Long orderId, Integer payType) {
        return null;
    }

    @Override
    public Integer cancelTimeOutOrder() {
        return null;
    }

    @Override
    public void cancelOrder(Long orderId) {

    }

    @Override
    public void sendDelayMessageCancelOrder(Long orderId) {

    }

    @Override
    public void confirmReceiveOrder(Long orderId) {

    }

    @Override
    public CommonPage<OmsOrderDetail> list(Integer status, Integer pageNum, Integer pageSize) {
        return null;
    }

    @Override
    public OmsOrderDetail detail(Long orderId) {
        return null;
    }

    @Override
    public void deleteOrder(Long orderId) {

    }
}
