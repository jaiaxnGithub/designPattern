package com.jaiaxn.design.pattern.structured.proxy.jdk;

import java.lang.reflect.Proxy;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月26日
 * @description: JDK自带的动态代理
 **/
public class JDKProxyDemoTest {
    public static void main(String[] args) {
        Subject realSubject =  new RealSubject();

        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(realSubject);

        // 代理对象
        Subject proxyClass = (Subject) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Subject.class}, myInvocationHandler);

        proxyClass.printBookName();

        proxyClass.printBookLanguage();
    }
    // 打印书名
    // 调用的是打印书名的方法
    // 打印书用到的语言
    // 调用的是打印书用到的语言的方法
}
