package com.jaiaxn.design.pattern.behavioral.strategy;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月27日
 * @description: 策略模式
 **/
public class StrategyDemoTest {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
    // 10 + 5 = 15
    // 10 - 5 = 5
    // 10 * 5 = 50
}
