package com.jaiaxn.design.pattern.created.singleton.ehan;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月16日
 * @description: 饿汉式，线程安全
 * 没有加锁，执行效率会提高；类加载时就初始化，浪费内存
 **/
public class Singleton {
    private Singleton instance = new Singleton();

    private Singleton() {
    }

    public Singleton getInstance() {
        return instance;
    }
}
