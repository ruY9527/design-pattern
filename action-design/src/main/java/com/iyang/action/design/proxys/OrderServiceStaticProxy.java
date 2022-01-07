package com.iyang.action.design.proxys;

import com.iyang.action.design.command.Order;

import java.text.SimpleDateFormat;
import java.util.Date;

/*****
 *  * ( •_•)                          (•_• )
 *    ( ง )ง                          ୧( ୧ )
 *    /︶\                              /︶\
 * @author : LuoHong
 * @date: 2022/1/6
 * @ProjectName: factory-design
 * @desc:
 **/


public class OrderServiceStaticProxy implements IOrderService {

    private SimpleDateFormat YEAR_FORMAT = new SimpleDateFormat("yyyy");
    private IOrderService iOrderService;

    public OrderServiceStaticProxy(IOrderService iOrderService){
        this.iOrderService = iOrderService;
    }

    @Override
    public int createOrder(IOrder iOrder) {

        before();
        Long createTime = iOrder.getCreateTime();
        Integer dbRouter = Integer.valueOf(YEAR_FORMAT.format(new Date(createTime)));
        System.out.println("静态代理类分配到{DB_" + dbRouter + "}数据源处理数据");
        DynamicDataSourceEntry.set(dbRouter);
        iOrderService.createOrder(iOrder);
        after();
        return -1;
    }

    private void before(){
        System.out.println("执行before方法");
    }

    public void after(){
        System.out.println("执行after方法");
    }

    public static void main(String[] args) throws Exception {

        IOrder iOrder = new IOrder();
        Date date = new SimpleDateFormat("yyyy-MM-dd").parse("2021-12-12");
        iOrder.setCreateTime(date.getTime());
        IOrderService orderService = new OrderServiceStaticProxy(new IOrderServiceImpl());
        orderService.createOrder(iOrder);

    }

}
