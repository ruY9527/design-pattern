package com.iyang.factory.design.simple;

/**
 * 圆形 - 简单工厂模式具体产品
 *
 * @author Yang
 * @since 2021/2/4
 */
public class Circle extends Shape {

    public Circle() {
        System.out.println("创建圆形对象");
    }

    @Override
    public void draw() {
        System.out.println("绘制圆形: Circle.draw()");
    }
}
