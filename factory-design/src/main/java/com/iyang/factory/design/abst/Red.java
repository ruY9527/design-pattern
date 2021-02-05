package com.iyang.factory.design.abst;

/**
 * Created by Yang on 2021/2/4 22:47
 */

public class Red implements Color {

    @Override
    public void fill() {
        System.out.println("Red 类中的fill方法");
    }
}
