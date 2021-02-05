package com.iyang.action.design.chains;

/**
 * Created by Yang on 2021/2/5 23:31
 */

public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Console 级别的输出 : " + message);
    }
}
