package com.jaiaxn.design.pattern.behavioral.chain.of.responsibility;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月26日
 * @description:
 **/
public abstract class AbstractLogger {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    protected int level;

    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message) {
        if (this.level <= level) {
            write(message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }

    /**
     * 打印日志消息
     *
     * @param message 日志消息
     */
    protected abstract void write(String message);
}
