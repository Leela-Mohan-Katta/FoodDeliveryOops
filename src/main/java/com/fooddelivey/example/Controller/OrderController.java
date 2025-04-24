package com.fooddelivey.example.Controller;

import com.fooddelivey.example.Service.OrderService;
import com.fooddelivey.example.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public String createOrder(@RequestBody Customer customer) {
        return orderService.placeOrder(customer);
    }
}

