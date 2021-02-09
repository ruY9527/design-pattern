package com.iyang.action.design.nullobject;

import java.util.Arrays;

/**
 * Created by Yang on 2021/2/9 23:07
 *
 * 空对象模式 : 一个空对象取代 NULL 对象实例的检查.  Null 对象不是检查空值,而是反应一个不做任何动作的关系.
 * 在对象模式中,我们创建一个指定各种执行的操作的抽象类和扩展该类的实例类,还创建一个未对该类做任何实现的空对象,该空对象
 * 类将无缝的使用在需要检查空值的地方.
 */

public class CustomerFactory {

    public static final String [] names = { "Rob", "Joe", "Julie" };

    public static AbstractCustomer getCustomer(String name){

        for(String n : names){
            if(n.equalsIgnoreCase(name)){
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }

}
