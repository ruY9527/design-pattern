package com.iyang.design.composite.entity;

/**
 * Created by Yang on 2021/3/2 23:06
 */

public class CompositeEntityPatternDemo {

    public static void main(String[] args) {

        Client client = new Client();
        client.setData("Data1","Data2");
        client.printData();
        client.setData("Data1111","Data2222");
        client.printData();

    }

}
