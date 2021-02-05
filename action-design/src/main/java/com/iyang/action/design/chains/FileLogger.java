package com.iyang.action.design.chains;

/**
 * Created by Yang on 2021/2/5 23:33
 */

public class FileLogger extends AbstractLogger {

    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File级别的输出 : " + message);
    }
}
