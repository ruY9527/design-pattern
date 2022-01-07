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
public class LoginForQqAdapter implements LoginAdapter  {

    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForQqAdapter;
    }

    @Override
    public Object login(String id, Object adapter) {
        return null;
    }

}
