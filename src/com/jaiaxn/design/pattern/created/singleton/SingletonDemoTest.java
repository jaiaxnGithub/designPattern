package com.jaiaxn.design.pattern.created.singleton;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月16日
 * @description:
 **/
public class SingletonDemoTest {
    public static void main(String[] args) {
        System.out.println("不建议使用懒汉式--lazy.Singleton/lazy.syn.Singleton");
        System.out.println("建议使用饿汉式--ehan.Singleton");
        System.out.println("只有在要明确实现lazy loading效果时，才会使用登记/静态内部类的方式--staticinnerclass.Singleton");
        System.out.println("如果涉及到反序列化创建对象时，可以尝试使用枚举式--enuminstance.Singleton");
        System.out.println("如果有其他特殊的需求，可以考虑使用双检锁/双重校验锁的方式--dcl.Singleton");
    }
}
