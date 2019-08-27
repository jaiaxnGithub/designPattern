package com.jaiaxn.design.pattern.structured.bridge;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月22日
 * @description:
 **/
public abstract class Coffee {

    protected CoffeeFlavor mFlavor;

    public Coffee(CoffeeFlavor flavor) {
        this.mFlavor = flavor;
    }

    /**
     * 制作咖啡
     */
    public abstract void makeCoffee();
}
