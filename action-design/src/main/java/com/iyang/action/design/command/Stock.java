package com.iyang.action.design.command;

/**
 * Created by Yang on 2021/2/5 23:40
 */

public class Stock {

    private String name = "ABC";
    private int quantity = 10;

    public void buy(){
        System.out.println("Stock [ name " + name + ",Quantity: " + quantity + " ] bought");
    }

    public void sell(){
        System.out.println("Stock [ Name : " + name + " , Quantity: " + quantity + " ] sold");
    }

}
