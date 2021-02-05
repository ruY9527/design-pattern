package com.iyang.factory.design.abst;

import com.iyang.factory.design.simple.ShapeFactory;

/**
 * Created by Yang on 2021/2/4 22:52
 */

public class FactoryProducer {

    public static AbstractFactory getFactory(String choice){

        if("SHAPE".equalsIgnoreCase(choice)){
            return new ColorFactory();
        }
        // else if 可以添加其他的生产工厂进来.
        return null;

    }

    public static void main(String[] args) {

        AbstractFactory factory = FactoryProducer.getFactory("shape");
        Color red = factory.getColor("red");
        red.fill();

    }

}
