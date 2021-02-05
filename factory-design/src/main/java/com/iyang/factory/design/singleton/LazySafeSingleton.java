package com.iyang.factory.design.singleton;

/**
 * Created by Yang on 2021/2/4 22:59
 *
 * 懒汉式线程安全模式
 */

public class LazySafeSingleton {

    private static LazySafeSingleton instance;

    private LazySafeSingleton(){}

    public static synchronized LazySafeSingleton getInstance(){
        if(instance == null){
            instance = new LazySafeSingleton();
        }
        return instance;
    }

}
