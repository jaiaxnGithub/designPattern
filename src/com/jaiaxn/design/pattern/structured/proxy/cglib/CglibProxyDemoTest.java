package com.jaiaxn.design.pattern.structured.proxy.cglib;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月26日
 * @description: Cglib动态代理
 **/
public class CglibProxyDemoTest {
    public static void main(String[] args) {
        Engineer engineerProxy = (Engineer) CglibProxy.getProxy(new Engineer());
        engineerProxy.work();
        // private或是final类修饰的方法不会被重写
        engineerProxy.sleep();
    }
}
