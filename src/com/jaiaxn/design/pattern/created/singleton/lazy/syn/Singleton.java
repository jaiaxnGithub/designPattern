package com.jaiaxn.design.pattern.created.singleton.lazy.syn;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月16日
 * @description: 懒汉式，线程安全
 * 这种方式具备很好的 lazy loading，能够在多线程中很好的工作，但是，效率很低，99% 情况下不需要同步。
 **/
public class Singleton {
    private Singleton instance;

    private Singleton() {
    }

    public synchronized Singleton getInstance() {
        if (null == instance) {
            return new Singleton();
        }
        return instance;
    }
}
