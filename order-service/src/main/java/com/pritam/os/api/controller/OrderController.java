package com.pritam.os.api.controller;

import com.pritam.os.api.common.TransactionRequest;
import com.pritam.os.api.common.TransactionResponse;
import com.pritam.os.api.entity.Order;
import com.pritam.os.api.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/bookOrder")
    public TransactionResponse bookOrder(@RequestBody TransactionRequest request){

        return orderService.saveOrder(request);
    }
}
