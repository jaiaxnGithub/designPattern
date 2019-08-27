package com.jaiaxn.design.pattern.created.builder;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月16日
 * @description:
 **/
public class Director {
    /**
     * 装机操作
     * @param build
     */
    public void build(BuildComputer build) {
        build.builderCPU();
        build.builderMainBoard();
        build.builderHD();
    }
}
