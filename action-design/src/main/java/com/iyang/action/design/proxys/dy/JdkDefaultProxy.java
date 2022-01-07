package com.iyang.action.design.proxys.dy;

import com.iyang.action.design.proxys.IPerson;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*****
 *  * ( •_•)                          (•_• )
 *    ( ง )ง                          ୧( ୧ )
 *    /︶\                              /︶\
 * @author : LuoHong
 * @date: 2022/1/6
 * @ProjectName: factory-design
 * @desc:
 **/


public class JdkDefaultProxy implements InvocationHandler {

    private Object target;

    public Object getInstance(Object target) throws Exception {

        this.target = target;
        Class<?> aClass = target.getClass();
        return Proxy.newProxyInstance(aClass.getClassLoader(),aClass.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object invoke = method.invoke(this.target, args);
        after();
        return invoke;
    }

    private void before(){

        System.out.println("com.iyang.action.design.proxys.dy.JdkDefaultProxy.before方法被掉调用");
    }

    private void after(){

        System.out.println("com.iyang.action.design.proxys.dy.JdkDefaultProxy.after方法被掉调用");
    }


    public static void main(String[] args) throws Exception {

        IPerson person =  (IPerson) new JdkDefaultProxy().getInstance(new ICustomer());
        person.findIt();

        byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{IPerson.class});
        FileOutputStream os = new FileOutputStream("/media/luohong/data3/github_self/design-pattern/$Proxy0.class");
        os.write(bytes);
        os.close();
    }
}
