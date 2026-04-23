package com.iyang.factory.design.singleton;

/**
 * 双重检查锁单例模式
 * <p>
 * 特点：
 * 1. 线程安全：使用 synchronized 和 volatile 确保线程安全
 * 2. 延迟加载：只有在第一次调用时才创建实例
 * 3. 性能优化：双重检查减少不必要的同步开销
 * </p>
 * <p>
 * 注意事项：
 * - JDK 1.5 之后 volatile 才能正确工作
 * - 这种方式比同步方法性能更好
 * </p>
 *
 * @author Yang
 * @since 2021/2/4
 */
public class DoubleCheckSingleton {

    /**
     * volatile 确保多线程环境下的可见性和禁止指令重排序
     */
    private static volatile DoubleCheckSingleton singleton;

    /**
     * 私有构造函数，防止外部实例化
     */
    private DoubleCheckSingleton() {
    }

    /**
     * 获取单例实例
     * <p>
     * 双重检查锁实现：
     * 1. 第一次检查 singleton 是否为 null，避免不必要的同步
     * 2. 加锁，确保只有一个线程能进入
     * 3. 第二次检查，防止其他线程已经创建了实例
     * </p>
     *
     * @return 单例实例
     */
    public static DoubleCheckSingleton getSingleton() {
        if (singleton == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (singleton == null) {
                    singleton = new DoubleCheckSingleton();
                }
            }
        }
        return singleton;
    }

    /**
     * 示例业务方法
     */
    public void doSomething() {
        System.out.println("DoubleCheckSingleton doSomething method called");
    }
}
