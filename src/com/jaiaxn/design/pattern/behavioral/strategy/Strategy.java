package com.jaiaxn.design.pattern.behavioral.strategy;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月27日
 * @description:
 **/
public interface Strategy {
    /**
     * 执行操作
     * @param num1 入参1
     * @param num2 入参2
     * @return 结果
     */
    int doOperation(int num1, int num2);
}
