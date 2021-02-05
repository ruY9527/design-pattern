package com.iyang.action.design.chains;

/**
 * Created by Yang on 2021/2/5 23:32
 */

public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error级别调用 : " + message);
    }
}
