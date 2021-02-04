package com.iyang.factory.design.simple;

/**
 * Created by Yang on 2021/2/4 22:20
 */

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Square中调用draw方法");
    }
}
