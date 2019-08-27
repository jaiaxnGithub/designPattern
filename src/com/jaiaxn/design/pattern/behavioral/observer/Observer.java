package com.jaiaxn.design.pattern.behavioral.observer;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月27日
 * @description:
 **/
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
