package com.iyang.action.design.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yang on 2021/2/5 23:44
 */

public class Broker {

    private List<Order> orderList = new ArrayList<>();

    // 添加指令
    public void takeOrder(Order order){
        orderList.add(order);
    }

    // 执行指令,然后情况封装指令的集合.
    public void placeOrders(){
        orderList.forEach(order -> order.execute());
        orderList.clear();
    }

}
