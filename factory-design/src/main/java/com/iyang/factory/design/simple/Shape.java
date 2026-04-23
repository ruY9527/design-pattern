package com.iyang.factory.design.simple;

/**
 * 形状抽象类 - 简单工厂模式
 * <p>
 * 简单工厂模式核心：
 * 定义产品类的公共接口，具体产品类实现此接口。
 * </p>
 *
 * @author Yang
 * @since 2021/2/4
 */
public abstract class Shape implements Cloneable {

    /**
     * 绘制形状
     */
    public abstract void draw();

    /**
     * 克隆形状对象（原型模式支持）
     *
     * @return 克隆后的形状对象
     */
    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("克隆失败: " + e.getMessage(), e);
        }
    }
}
