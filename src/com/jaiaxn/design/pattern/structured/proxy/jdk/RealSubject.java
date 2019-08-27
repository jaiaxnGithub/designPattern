package com.jaiaxn.design.pattern.structured.proxy.jdk;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月26日
 * @description:
 **/
public class RealSubject implements Subject {

    @Override
    public void printBookName() {
        System.out.println("打印书名");
    }

    @Override
    public void printBookLanguage() {
        System.out.println("打印书用到的语言");
    }
}
