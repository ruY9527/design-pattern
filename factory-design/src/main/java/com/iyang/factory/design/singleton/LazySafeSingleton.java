package com.iyang.factory.design.singleton;

/**
 * 懒汉式双重检查锁单例模式
 * <p>
 * 特点：
 * 1. 延迟加载，只有在第一次调用 getInstance() 时才创建实例
 * 2. 线程安全，使用双重检查锁机制
 * 3. 使用 volatile 关键字防止指令重排序
 * </p>
 *
 * @author Yang
 * @since 2021/2/4
 */
public class LazySafeSingleton {

    /**
     * volatile 关键字确保：
     * 1. 可见性：一个线程修改后，其他线程立即可见
     * 2. 禁止指令重排序：防止 instance = new LazySafeSingleton() 被重排序
     */
    private static volatile LazySafeSingleton instance;

    /**
     * 私有构造函数，防止外部通过 new 创建实例
     */
    private LazySafeSingleton() {
    }

    /**
     * 获取单例实例
     * <p>
     * 双重检查锁机制：
     * 第一次检查：避免不必要的同步
     * 第二次检查：确保只创建一个实例
     * </p>
     *
     * @return 单例实例
     */
    public static LazySafeSingleton getInstance() {
        if (instance == null) {
            synchronized (LazySafeSingleton.class) {
                if (instance == null) {
                    instance = new LazySafeSingleton();
                }
            }
        }
        return instance;
    }

    /**
     * 示例业务方法
     */
    public void doSomething() {
        System.out.println("LazySafeSingleton doSomething method called");
    }
}
