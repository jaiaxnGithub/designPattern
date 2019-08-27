package com.jaiaxn.design.pattern.structured.proxy.cglib;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月26日
 * @description:
 **/
public class Engineer {

    public void work(){
        System.out.println("working...");
    }

    public final void sleep(){
        System.out.println("sleeping...");
    }

    private void play(){
        System.out.println("playing...");
    }
}
