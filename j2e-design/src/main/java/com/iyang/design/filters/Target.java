package com.iyang.design.filters;

/**
 * Created by Yang on 2021/3/3 22:59
 */

public class Target {

    public void execute(String request){
        System.out.println("Executing request: " + request);
    }

}
