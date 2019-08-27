package com.jaiaxn.design.pattern.behavioral.chain.of.responsibility;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月26日
 * @description:
 **/
public class DebugLogger extends AbstractLogger {

    public DebugLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Debug Logger: " + message);
    }
}