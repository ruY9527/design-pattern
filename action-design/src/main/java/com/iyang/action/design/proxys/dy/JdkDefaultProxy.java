package com.iyang.action.design.proxys.dy;

import com.iyang.action.design.proxys.IPerson;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK 动态代理
 * <p>
 * JDK 动态代理基于反射机制实现，只能代理实现了接口的类。
 * 核心原理：
 * 1. 通过 Proxy.newProxyInstance() 创建代理对象
 * 2. 代理对象调用方法时，会触发 InvocationHandler.invoke()
 * 3. 在 invoke() 中可以添加前置/后置处理逻辑
 * </p>
 * <p>
 * 与静态代理的区别：
 * - 静态代理：代理类在编译时确定，一个代理类只能代理一个目标类
 * - 动态代理：代理类在运行时动态生成，一个代理处理器可以代理多个目标类
 * </p>
 *
 * @author LuoHong
 * @author Yang (optimized)
 * @since 2022/1/6
 */
public class JdkDefaultProxy implements InvocationHandler {

    /**
     * 目标对象（被代理对象）
     */
    private Object target;

    /**
     * 获取代理实例
     *
     * @param target 目标对象
     * @return 代理对象
     */
    public Object getInstance(Object target) {
        this.target = target;
        Class<?> targetClass = target.getClass();
        return Proxy.newProxyInstance(
                targetClass.getClassLoader(),
                targetClass.getInterfaces(),
                this
        );
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(this.target, args);
        after();
        return result;
    }

    /**
     * 前置处理
     */
    private void before() {
        System.out.println("JdkDefaultProxy.before() - 方法调用前处理");
    }

    /**
     * 后置处理
     */
    private void after() {
        System.out.println("JdkDefaultProxy.after() - 方法调用后处理");
    }

    /**
     * 测试入口
     */
    public static void main(String[] args) {
        IPerson person = (IPerson) new JdkDefaultProxy().getInstance(new ICustomer());
        person.findIt();
    }
}
