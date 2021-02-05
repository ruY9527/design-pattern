package com.iyang.factory.design.singleton;

/**
 * Created by Yang on 2021/2/4 22:57
 *
 * 懒汉式非线程安全.
 */

public class LazyNoSafeSingleton {

    private static LazyNoSafeSingleton instance;

    private LazyNoSafeSingleton(){}

    /**
     *
     * @return
     */
    public static LazyNoSafeSingleton getInstance(){
        if(instance == null){
            instance = new LazyNoSafeSingleton();
        }
        return instance;
    }

    public void say(){
        System.out.println("LazyNoSafeSingleton 调用 say 方法");
    }

    public static void main(String[] args) {

        LazyNoSafeSingleton.getInstance().say();
    }

}
