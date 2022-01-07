package com.iyang.action.design.adapters;

/*****
 *  * ( •_•)                          (•_• )
 *    ( ง )ง                          ୧( ୧ )
 *    /︶\                              /︶\
 * @author : LuoHong
 * @date: 2022/1/6
 * @ProjectName: factory-design
 * @desc:
 **/

public interface LoginAdapter {


    boolean support(Object adapter);

    Object login(String id , Object adapter);

}
