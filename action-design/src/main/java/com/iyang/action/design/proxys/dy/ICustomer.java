package com.iyang.action.design.proxys.dy;

import com.iyang.action.design.proxys.IPerson;

/*****
 *  * ( •_•)                          (•_• )
 *    ( ง )ง                          ୧( ୧ )
 *    /︶\                              /︶\
 * @author : LuoHong
 * @date: 2022/1/6
 * @ProjectName: factory-design
 * @desc:
 **/

public class ICustomer implements IPerson {


    @Override
    public void findIt() {

        System.out.println("这就是我的要求");

    }
}
