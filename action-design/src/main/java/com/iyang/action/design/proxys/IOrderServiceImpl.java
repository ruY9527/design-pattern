package com.iyang.action.design.proxys;

/*****
 *  * ( •_•)                          (•_• )
 *    ( ง )ง                          ୧( ୧ )
 *    /︶\                              /︶\
 * @author : LuoHong
 * @date: 2022/1/6
 * @ProjectName: factory-design
 * @desc:
 **/

public class IOrderServiceImpl implements IOrderService {

    private OrderDao orderDao;

    public IOrderServiceImpl(){
        orderDao = new OrderDao();
    }

    @Override
    public int createOrder(IOrder iOrder) {
        System.out.println("开始调用orderDao.insert方法");

        return orderDao.insert(iOrder);
    }

}
