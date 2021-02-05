package com.iyang.factory.design.simple;

/**
 * Created by Yang on 2021/2/4 22:19
 */


public class Rectangle extends Shape {

    public Rectangle(){
        System.out.println("Rectangle中的无参数构造函数");
    }

    @Override
    public void draw() {
        System.out.println("调用Rectangle中draw方法");
    }
}
