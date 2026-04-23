package com.iyang.factory.design.singleton;

/**
 * 枚举单例模式
 * <p>
 * 特点：
 * 1. 实现简单，代码简洁
 * 2. 线程安全：由 JVM 保证
 * 3. 防止反射攻击：枚举类型不能通过反射创建
 * 4. 防止序列化破坏：枚举自带序列化机制
 * </p>
 * <p>
 * 推荐使用场景：
 * - 需要单例的场景首选
 * - Effective Java 作者 Josh Bloch 推荐的实现方式
 * </p>
 *
 * @author Yang
 * @since 2021/2/4
 */
public enum EnumSingleton {

    /**
     * 单例实例
     */
    INSTANCE;

    /**
     * 示例业务方法
     */
    public void doSomething() {
        System.out.println("EnumSingleton doSomething method called");
    }

    /**
     * 获取单例实例（可选的便捷方法）
     *
     * @return 单例实例
     */
    public static EnumSingleton getInstance() {
        return INSTANCE;
    }
}
