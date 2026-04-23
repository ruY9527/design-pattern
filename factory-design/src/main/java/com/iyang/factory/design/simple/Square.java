package com.iyang.factory.design.simple;

/**
 * 正方形 - 简单工厂模式具体产品
 *
 * @author Yang
 * @since 2021/2/4
 */
public class Square extends Shape {

    @Override
    public void draw() {
        System.out.println("绘制正方形: Square.draw()");
    }
}
