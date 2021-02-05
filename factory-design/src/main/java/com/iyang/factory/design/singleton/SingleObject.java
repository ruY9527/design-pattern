package com.iyang.factory.design.singleton;

/**
 * Created by Yang on 2021/2/4 22:55
 */

public class SingleObject {

    private static SingleObject singleObject = new SingleObject();

    private SingleObject() {}

    public static SingleObject getInstance(){
        return singleObject;
    }

    public void showMessage(){
        System.out.println("SingleObject调用showMessage方法");
    }

    public static void main(String[] args) {

        SingleObject.getInstance().showMessage();

    }

}
