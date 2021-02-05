package com.iyang.factory.design.abst;

import com.iyang.factory.design.simple.Shape;

/**
 * Created by Yang on 2021/2/4 22:49
 */

public abstract class AbstractFactory {

    /**
     * Get Color By Color.
     * @param color
     * @return
     */
    public abstract Color getColor(String color);

    /**
     * Get Shape by shapeType.
     * @param shapeType
     * @return
     */
    public abstract Shape getShape(String shapeType);

}
