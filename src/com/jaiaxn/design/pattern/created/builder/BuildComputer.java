package com.jaiaxn.design.pattern.created.builder;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月16日
 * @description:
 **/
public abstract class BuildComputer {
    /**
     * 装CPU
     */
    public abstract void builderCPU();

    /**
     * 装主板
     */
    public abstract void builderMainBoard();

    /**
     * 装硬盘
     */
    public abstract void builderHD();

    /**
     * 获得装好的电脑
     *
     * @return 装好的电脑
     */
    public abstract Computer getComputer();
}
