package com.flank.javastudy.designpattern.createpatter.commandpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: flank
 * @date: 2022/1/24
 * @description:
 */
public class Broker {
    private List<Order> orders = new ArrayList<>();

    public void takeOrder(Order order) {
        orders.add(order);
    }

    public void consumeOrder() {
        orders.forEach(Order::execute);
        orders.clear();
    }

}
