package com.jaiaxn.design.pattern.created.singleton.enuminstance;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月16日
 * @description: 枚举，线程安全
 *实现单例模式的最佳方法。它更简洁，自动支持序列化机制，绝对防止多次实例化。
 **/
public enum Singleton {
    /**
     * INSTANCE
     */
    INSTANCE;

    /**
     * whateverMethod
     */
    public void whateverMethod() {
    }
}
