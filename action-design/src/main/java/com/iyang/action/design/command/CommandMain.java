package com.iyang.action.design.command;

/**
 * Created by Yang on 2021/2/5 23:46
 *
 * 测试类 CommandMain Test
 *
 * 将一个请求封装为一个对象,从而使你可以用不同的请求怼客户进行参数化.
 */

public class CommandMain {

    public static void main(String[] args) {

        Stock abcStock = new Stock();
        BuyStock buyStock = new BuyStock(abcStock);
        SellStock sellStock = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStock);
        broker.takeOrder(sellStock);
        broker.placeOrders();

    }

}
