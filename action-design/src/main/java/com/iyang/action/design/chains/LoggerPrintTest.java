package com.iyang.action.design.chains;

/**
 * Created by Yang on 2021/2/5 23:34
 *
 * Main Test Class.
 */

public class LoggerPrintTest {

    private static AbstractLogger getChainOfLoggers(){

        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }


    public static void main(String[] args) {

        AbstractLogger abstractLogger = getChainOfLoggers();
        abstractLogger.logMessage(AbstractLogger.INFO, "This is an information.");
        abstractLogger.logMessage(AbstractLogger.DEBUG, "This is a debug level information.");
        abstractLogger.logMessage(AbstractLogger.ERROR, "This is an error information.");

    }

}
