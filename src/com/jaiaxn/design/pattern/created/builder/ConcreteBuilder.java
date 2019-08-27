package com.jaiaxn.design.pattern.created.builder;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月16日
 * @description:
 **/
public class ConcreteBuilder extends BuildComputer {

    private Computer computer;

    public ConcreteBuilder(){
        this.computer = new Computer();
    }

    @Override
    public void builderCPU() {
        computer.buildParts("CPU");
    }

    @Override
    public void builderMainBoard() {
        computer.buildParts("主板");
    }

    @Override
    public void builderHD() {
        computer.buildParts("硬盘");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
