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


public class OrderDao {

    public int insert(IOrder iOrder){

        System.out.println("OrderDao.insert()方法调用成功");

        return 1;
    }

}
