package com.iyang.factory.design.simple;

/**
 * Created by Yang on 2021/2/4 22:21
 */

public class ShapeFactory {

    /**
     *
     * @param shareType
     * @return
     */
    public static Shape getShape(String shareType){
        if("CIRCLE".equalsIgnoreCase(shareType)){
            return new Circle();
        } else if("RECTANGLE".equalsIgnoreCase(shareType)){
            return new Rectangle();
        } else if ("SQUARE".equalsIgnoreCase(shareType)){
            return new Square();
        }
        return null;
    }

    public static void main(String[] args) {

        Shape shape = ShapeFactory.getShape("RECTANGLE");
        shape.draw();

    }

}
