package com.iyang.factory.design.simple;

/**
 * 矩形 - 简单工厂模式具体产品
 *
 * @author Yang
 * @since 2021/2/4
 */
public class Rectangle extends Shape {

    public Rectangle() {
        System.out.println("创建矩形对象");
    }

    @Override
    public void draw() {
        System.out.println("绘制矩形: Rectangle.draw()");
    }
}
