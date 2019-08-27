package com.jaiaxn.design.pattern.structured.bridge;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月22日
 * @description:
 **/
public class PlainCoffeeFlavor implements CoffeeFlavor {
    @Override
    public void addWhat() {
        System.out.println("什么也不加（原味）");
    }
}
