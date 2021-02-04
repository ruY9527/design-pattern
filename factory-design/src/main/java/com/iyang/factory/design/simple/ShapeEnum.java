package com.iyang.factory.design.simple;

/**
 * Created by Yang on 2021/2/4 22:25
 *
 * 使用枚举来代理工厂的生产.
 */

public enum ShapeEnum {
    CIRCLESHAPE("circle",new Circle(),Circle.class.toString()),RECTANGLE("rectangel",new Rectangle());

    private String type;
    private Shape shape;
    private String clazz;

    ShapeEnum(String type, Shape shape) {
        this.type = type;
        this.shape = shape;
    }

    ShapeEnum(String type, Shape shape, String clazz) {
        this.type = type;
        this.shape = shape;
        this.clazz = clazz;
    }

    public static void main(String[] args) {

        Shape shape = ShapeEnum.CIRCLESHAPE.shape;
        Shape shape1 = ShapeEnum.CIRCLESHAPE.shape;

    }

}
