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


public class DynamicDataSourceEntry {

    public final static String DEFAULT_SOURCE = null;

    private static final ThreadLocal<String> LOCAL = new ThreadLocal<>();

    private DynamicDataSourceEntry(){}

    public static void clearAll(){
        LOCAL.remove();
    }

    public static String  get(){
        return LOCAL.get();
    }

    public static void restore(){
        LOCAL.set(DEFAULT_SOURCE);
    }

    public static void set(String source){
        LOCAL.set(source);
    }

    public static void set(int year){
        LOCAL.set("DB_" + year);
    }

}
