package com.jaiaxn.design.pattern.created.builder;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月16日
 * @description: 建造者模式
 **/
public class BuilderFactoryDemoTest {
    public static void main(String[] args) {
        Director director = new Director();
        BuildComputer builder = new ConcreteBuilder();
        director.build(builder);

        Computer computer = builder.getComputer();
        computer.printComputer();
    }
}
