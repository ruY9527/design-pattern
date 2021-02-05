package com.iyang.action.design.chains;

/**
 * Created by Yang on 2021/2/5 23:13
 *
 * 责任链模式.
 * 职责链上的处理者负责处理请求,客户只需要将请求发送到职责链上即可.
 */

public abstract class AbstractLogger {

    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    protected int level;

    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level,String message){
        if(this.level <= level){
            write(message);
        }
        if(nextLogger != null){
            nextLogger.logMessage(level, message);
        }
    }

    abstract protected void write(String message);

}
