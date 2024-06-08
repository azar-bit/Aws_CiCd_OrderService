package com.spring.learning.order_cicd_ecs.controller;

import com.spring.learning.order_cicd_ecs.dao.OrderDao;
import com.spring.learning.order_cicd_ecs.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/orders")
public class MyController {


    @Autowired
    private OrderDao orderDao;
    @GetMapping("/s")
    public String Message() {
        return ":: Hello Azaruddin Have a Good day :: ";
    }

    @GetMapping
    public List<Order> getOrderList() {
        return orderDao.getOrders()
                .stream().sorted(Comparator.comparing(Order::getPrice).reversed()).collect(Collectors.toList());
    }
}
