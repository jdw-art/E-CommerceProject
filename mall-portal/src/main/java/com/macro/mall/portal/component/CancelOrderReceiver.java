package com.macro.mall.portal.component;

import com.macro.mall.portal.service.OmsPortalOrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author: Jacob
 * @Description: TODO 取消订单消息的接收者
 * @Date: 2024/2/29 16:11
 * @Version: 1.0
 */
@Component
@RabbitListener(queues = "mall.order.cancel")
public class CancelOrderReceiver {
    private static final Logger LOGGER = LoggerFactory.getLogger(CancelOrderReceiver.class);
    @Autowired
    private OmsPortalOrderService portalOrderService;

    @RabbitHandler
    public void handle(Long orderId) {
        portalOrderService.cancelOrder(orderId);
        LOGGER.info("process orderId:{}", orderId);
    }
}
