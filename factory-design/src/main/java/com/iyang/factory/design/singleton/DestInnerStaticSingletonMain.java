package com.iyang.factory.design.singleton;

import java.lang.reflect.Constructor;

/*****
 *  * ( •_•)                          (•_• )
 *    ( ง )ง                          ୧( ୧ )
 *    /︶\                              /︶\
 * @author : LuoHong
 * @date: 2022/1/6
 * @ProjectName: factory-design
 * @desc: 使用反射进行破坏
 **/

public class DestInnerStaticSingletonMain {

    public static void main(String[] args)  throws Exception {

        Class<InnerStaticSingleton> innerStaticSingletonClass = InnerStaticSingleton.class;
        Constructor<InnerStaticSingleton> constructor = innerStaticSingletonClass.getDeclaredConstructor();
        constructor.setAccessible(true);

        InnerStaticSingleton obj1 = constructor.newInstance();
        InnerStaticSingleton obj2 = constructor.newInstance();

        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj1 == obj2);
    }

}
