package com.jaiaxn.design.pattern.structured.bridge;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月22日
 * @description: 桥接模式
 **/
public class BridgeDemoTest {
    public static void main(String[] args) {
        // 大杯咖啡：原味
        new LargeCoffee(new PlainCoffeeFlavor()).makeCoffee();
        // 大杯咖啡：加糖
        new LargeCoffee(new SugarCofeeFlavor()).makeCoffee();
        // 小杯咖啡：原味
        new SmallCoffee(new PlainCoffeeFlavor()).makeCoffee();
        // 小杯咖啡：加糖
        new SmallCoffee(new SugarCofeeFlavor()).makeCoffee();
    }
    // 大杯咖啡: 什么也不加（原味）
    // 大杯咖啡: 加糖
    // 小杯咖啡: 什么也不加（原味）
    // 小杯咖啡: 加糖
}
