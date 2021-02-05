package com.iyang.factory.design.abst;

import com.iyang.factory.design.simple.Shape;

/**
 * Created by Yang on 2021/2/4 22:49
 */

public class ColorFactory extends AbstractFactory {

    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        if("RED".equalsIgnoreCase(color)){
            return new Red();
        } else if("GREEN".equalsIgnoreCase(color)){
            return new Green();
        } else if("BLUE".equalsIgnoreCase(color)){
            return new Blue();
        }
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        return null;
    }

}
