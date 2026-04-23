package com.iyang.factory.design.simple;

/**
 * 形状枚举 - 简单工厂模式的枚举实现
 * <p>
 * 使用枚举实现工厂模式的优势：
 * 1. 类型安全：编译时检查
 * 2. 单例保证：每个枚举实例只有一个
 * 3. 避免反射攻击：枚举类型不能通过反射创建
 * </p>
 *
 * @author Yang
 * @since 2021/2/4
 */
public enum ShapeEnum {
    /**
     * 圆形
     */
    CIRCLE(Circle.class),

    /**
     * 矩形
     */
    RECTANGLE(Rectangle.class),

    /**
     * 正方形
     */
    SQUARE(Square.class);

    private final Class<? extends Shape> shapeClass;

    ShapeEnum(Class<? extends Shape> shapeClass) {
        this.shapeClass = shapeClass;
    }

    /**
     * 创建形状实例
     *
     * @return 形状对象
     */
    public Shape createShape() {
        try {
            return shapeClass.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("创建形状失败: " + shapeClass.getSimpleName(), e);
        }
    }

    /**
     * 演示入口
     */
    public static void main(String[] args) {
        Shape circle1 = ShapeEnum.CIRCLE.createShape();
        Shape circle2 = ShapeEnum.CIRCLE.createShape();
        circle1.draw();
        circle2.draw();
    }
}
