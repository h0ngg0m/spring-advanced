package com.honggom.springadvanced.proxy.app.v2;

import com.honggom.springadvanced.proxy.app.v1.OrderServiceV1;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping
@ResponseBody
public class OrderControllerV2 {

    private final OrderServiceV1 orderService;

    public OrderControllerV2(OrderServiceV1 orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/v2/request")
    public String request(@RequestParam("itemId") String itemId) {
        orderService.orderItem(itemId);
        return "ok";
    }

    @GetMapping("/v2/no-log")
    public String noLog() {
        return "ok";
    }
}
