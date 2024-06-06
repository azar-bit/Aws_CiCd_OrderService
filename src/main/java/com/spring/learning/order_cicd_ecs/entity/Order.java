package com.spring.learning.order_cicd_ecs.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data@AllArgsConstructor@NoArgsConstructor
public class Order {

    private int id;
    private String name;
    private String quantity;
    private String price;
}
