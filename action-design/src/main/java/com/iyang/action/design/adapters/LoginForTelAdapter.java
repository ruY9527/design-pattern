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

public class LoginForTelAdapter implements LoginAdapter {


    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForTelAdapter;
    }

    @Override
    public Object login(String id, Object adapter) {
        return null;
    }

}
