package com.spring.learning.order_cicd_ecs.dao;

import com.spring.learning.order_cicd_ecs.entity.Order;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Repository
public class OrderDao {

    public List<Order> getOrders() {
        return Stream.of(new Order(1, "mobile", "10", "1000"),
                new Order(2, "laptop", "20", "2000"),
                new Order(3, "book", "30", "3000")).collect(Collectors.toList());
    }
}
