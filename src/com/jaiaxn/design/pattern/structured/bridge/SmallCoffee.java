package com.jaiaxn.design.pattern.structured.bridge;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月22日
 * @description:
 **/
public class SmallCoffee extends Coffee {

    public SmallCoffee(CoffeeFlavor flavor) {
        super(flavor);
    }

    @Override
    public void makeCoffee() {
        System.out.print("小杯咖啡: ");
        this.mFlavor.addWhat();
    }
}
