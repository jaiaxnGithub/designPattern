package com.jaiaxn.design.pattern.created.singleton.dcl;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月16日
 * @description: 双检锁/双重校验锁，线程安全
 * 这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
 **/
public class Singleton {
    private volatile Singleton instance;

    private Singleton() {
    }

    public Singleton getInstance() {
        if (null == instance) {
            synchronized (Singleton.class) {
                if (null == instance) {
                    return new Singleton();
                }
            }
        }
        return null;
    }
}
