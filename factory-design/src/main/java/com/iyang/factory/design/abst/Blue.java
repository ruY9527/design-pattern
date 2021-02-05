package com.iyang.factory.design.abst;

/**
 * Created by Yang on 2021/2/4 22:48
 */

public class Blue implements Color {

    @Override
    public void fill() {
        System.out.println("Blue类中的fill方法");
    }
}
