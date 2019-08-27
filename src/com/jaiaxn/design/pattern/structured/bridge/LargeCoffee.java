package com.jaiaxn.design.pattern.structured.bridge;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月22日
 * @description:
 **/
public class LargeCoffee extends Coffee {

    public LargeCoffee(CoffeeFlavor flavor) {
        super(flavor);
    }

    @Override
    public void makeCoffee() {
        System.out.print("大杯咖啡: ");
        this.mFlavor.addWhat();
    }
}
