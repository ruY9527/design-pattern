package com.iyang.factory.design.simple;

/**
 * 形状工厂 - 简单工厂模式核心
 * <p>
 * 简单工厂模式特点：
 * 1. 工厂类包含创建所有产品的逻辑
 * 2. 客户端只需传入参数，无需知道具体产品类
 * 3. 缺点：新增产品需要修改工厂类代码
 * </p>
 * <p>
 * 使用场景：
 * - 产品种类较少
 * - 客户端不需要知道具体创建细节
 * </p>
 *
 * @author Yang
 * @since 2021/2/4
 */
public class ShapeFactory {

    /**
     * 根据类型获取形状对象
     *
     * @param shapeType 形状类型 (CIRCLE, RECTANGLE, SQUARE)
     * @return 形状对象，类型无效时返回 null
     */
    public static Shape getShape(String shapeType) {
        if (shapeType == null || shapeType.isEmpty()) {
            return null;
        }

        switch (shapeType.toUpperCase()) {
            case "CIRCLE":
                return new Circle();
            case "RECTANGLE":
                return new Rectangle();
            case "SQUARE":
                return new Square();
            default:
                System.out.println("未知形状类型: " + shapeType);
                return null;
        }
    }

    /**
     * 使用枚举获取形状对象（优化版本）
     *
     * @param shapeEnum 形状枚举
     * @return 形状对象
     */
    public static Shape getShape(ShapeEnum shapeEnum) {
        return shapeEnum.createShape();
    }

    /**
     * 演示入口
     */
    public static void main(String[] args) {
        // 使用字符串参数
        Shape rectangle = ShapeFactory.getShape("RECTANGLE");
        if (rectangle != null) {
            rectangle.draw();
        }

        Shape circle = ShapeFactory.getShape("CIRCLE");
        if (circle != null) {
            circle.draw();
        }
    }
}
