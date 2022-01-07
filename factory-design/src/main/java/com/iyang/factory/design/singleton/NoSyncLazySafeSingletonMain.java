package com.iyang.factory.design.singleton;

/*****
 *  * ( •_•)                          (•_• )
 *    ( ง )ง                          ୧( ୧ )
 *    /︶\                              /︶\
 * @author : LuoHong
 * @date: 2022/1/6
 * @ProjectName: factory-design
 * @desc:  对懒汉式无锁进行线程测试
 **/


public class NoSyncLazySafeSingletonMain {

    /**
     * Thread-0:com.iyang.factory.design.singleton.LazySafeSingleton@575e6fef
     * Thread-2:com.iyang.factory.design.singleton.LazySafeSingleton@1588196a
     * Thread-1:com.iyang.factory.design.singleton.LazySafeSingleton@1588196a
     *
     * @param args
     */
    public static void main(String[] args) {

        new Thread(() -> {
            LazySafeSingleton instance = LazySafeSingleton.getInstance();
            System.out.println(Thread.currentThread().getName() + ":" + instance);
        }).start();

        new Thread(() -> {
            LazySafeSingleton instance = LazySafeSingleton.getInstance();
            System.out.println(Thread.currentThread().getName() + ":" + instance);
        }).start();

        new Thread(() -> {
            LazySafeSingleton instance = LazySafeSingleton.getInstance();
            System.out.println(Thread.currentThread().getName() + ":" + instance);
        }).start();

        System.out.println("The thread is over");
    }

}
