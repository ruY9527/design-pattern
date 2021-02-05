package com.iyang.factory.design.prototype;

import com.iyang.factory.design.simple.Circle;
import com.iyang.factory.design.simple.Rectangle;
import com.iyang.factory.design.simple.Shape;
import com.iyang.factory.design.simple.Square;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Yang on 2021/2/5 22:59
 */

public class PrototypeCache {

    /**
     *  原型模式 :  用于创建重复的对象,同时又能保证性能. 这种类型的设计模式属于创建型模式.提供一种对象创建最佳方式.
     */
    private static Map<String, Shape> CACHE_SHAPE_MAP = new ConcurrentHashMap<>(16);

    public static void init(){
        Circle circle = new Circle();
        Square square = new Square();
        Rectangle rectangle = new Rectangle();
        CACHE_SHAPE_MAP.put("1",circle);
        CACHE_SHAPE_MAP.put("2",square);
        CACHE_SHAPE_MAP.put("3",rectangle);
    }

    public static Shape getShape(String shapeId){
        Shape shape = CACHE_SHAPE_MAP.get(shapeId);
        return (Shape) shape.clone();
    }

}
