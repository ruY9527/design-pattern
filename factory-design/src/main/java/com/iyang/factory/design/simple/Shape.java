package com.iyang.factory.design.simple;

/**
 * Created by Yang on 2021/2/4 22:19
 */

public abstract class Shape implements Cloneable {

    /**
     * 定义方法.
     */
    abstract void draw();

    @Override
    public Object clone(){
        Object clone = null;
        try {
            clone = super.clone();
        }catch (Exception e){
            e.printStackTrace();
        }
        return clone;
    }

}
