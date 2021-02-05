package com.iyang.factory.design.simple;

/**
 * Created by Yang on 2021/2/4 22:21
 */

public class Circle extends Shape {

    public Circle(){
        System.out.println("Circle中的无参数构造函数调用次数");
    }

    @Override
    public void draw() {
        System.out.println("Circle中调用draw方法");
    }
}
