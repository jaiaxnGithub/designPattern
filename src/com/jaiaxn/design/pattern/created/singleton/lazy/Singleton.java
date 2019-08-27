package com.jaiaxn.design.pattern.created.singleton.lazy;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月16日
 * @description: 懒汉式，线程不安全
 * 最基本的实现方式，最大的问题就是不支持多线程
 **/
public class Singleton {
    private Singleton instance;

    private Singleton() {
    }

    public Singleton getInstance() {
        if (null == instance) {
            instance = new Singleton();
        }
        return instance;
    }
}
