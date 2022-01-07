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

public class ISon implements IPerson {


    @Override
    public void findIt() {

        System.out.println("ison 太忙,没时间进行处理");
    }
}
