package com.honggom.springadvanced.proxy.app.v2;

import com.honggom.springadvanced.proxy.app.v1.OrderRepositoryV1;

public class OrderServiceV2 {

    private final OrderRepositoryV1 orderRepositoryV1;

    public OrderServiceV2(OrderRepositoryV1 orderRepositoryV1) {
        this.orderRepositoryV1 = orderRepositoryV1;
    }

    public void orderItem(String itemId) {
        orderRepositoryV1.save(itemId);
    }
}
