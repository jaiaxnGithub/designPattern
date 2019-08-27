package com.jaiaxn.design.pattern.behavioral.interpreter;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月27日
 * @description:
 **/
public interface Expression {
    /**
     * 解释内容
     *
     * @param context 内容
     * @return 结果
     */
    boolean interpret(String context);
}
