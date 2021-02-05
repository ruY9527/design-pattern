package com.iyang.factory.design.singleton;

/**
 * Created by Yang on 2021/2/4 23:01
 */

public class DoubleCheckSingleton {

    private volatile static DoubleCheckSingleton singleton;

    private DoubleCheckSingleton(){}

    /**
     * 双重锁检验机制.
     * @return
     */
    public static DoubleCheckSingleton getSingleton(){
        if(singleton == null){
            synchronized (DoubleCheckSingleton.class){
                if(singleton == null){
                    singleton = new DoubleCheckSingleton();
                }
            }
        }
        return singleton;
    }

}
