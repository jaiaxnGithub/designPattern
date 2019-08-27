package com.jaiaxn.design.pattern.behavioral.chain.of.responsibility;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月26日
 * @description: 责任链模式
 **/
public class ChainOfResposibilityDemoTest {
    public static void main(String[] args) {
        AbstractLogger loggerChain = getLoggerChain();

        loggerChain.logMessage(AbstractLogger.INFO, "info level information");
        System.out.println("---------------");
        loggerChain.logMessage(AbstractLogger.DEBUG, "debug level information");
        System.out.println("---------------");
        loggerChain.logMessage(AbstractLogger.ERROR, "error level information");
    }
    // Console Logger: info level information
    // ---------------
    // Debug Logger: debug level information
    // Console Logger: debug level information
    // ---------------
    // Error Logger: error level information
    // Debug Logger: error level information
    // Console Logger: error level information

    private static AbstractLogger getLoggerChain(){
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new DebugLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        return errorLogger;
    }
}
