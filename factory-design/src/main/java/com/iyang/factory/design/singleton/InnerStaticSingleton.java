package com.iyang.factory.design.singleton;

/**
 * Created by Yang on 2021/2/4 23:05
 */

public class InnerStaticSingleton {

    private InnerStaticSingleton () {}

    public static final InnerStaticSingleton getInstance(){
        return InnerStaticInnerHolder.INSTANCE;
    }

    public void say(){
        System.out.println("InnerStaticSingleton的say方法");
    }

    private static class InnerStaticInnerHolder {
        private static final InnerStaticSingleton INSTANCE = new InnerStaticSingleton();
    }

    public static void main(String[] args) {
        InnerStaticSingleton.getInstance().say();
    }
}
