package com.jaiaxn.design.pattern.created.singleton.staticinnerclass;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月16日
 * @description: 登记式/静态内部类，线程安全
 * 这种方式能达到双检锁方式一样的功效，但实现更简单。
 **/
public class Singleton {
    private static class SingletonHolder {
        private static final Singleton instance = new Singleton();
    }

    private Singleton() {
    }

    public Singleton getInstance() {
        return SingletonHolder.instance;
    }
}
