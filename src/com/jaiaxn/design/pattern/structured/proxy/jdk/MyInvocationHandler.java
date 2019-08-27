package com.jaiaxn.design.pattern.structured.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月26日
 * @description:
 **/
public class MyInvocationHandler implements InvocationHandler {

    private Subject realSubject;

    public MyInvocationHandler(Subject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if ("printBookName".equals(method.getName())) {
            method.invoke(realSubject, args);
            System.out.println("调用的是打印书名的方法");
        } else {
            method.invoke(realSubject, args);
            System.out.println("调用的是打印书用到的语言的方法");
        }
        return null;
    }
}
