package com.jaiaxn.design.pattern.behavioral.visitor;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月27日
 * @description:
 **/
public interface ComputerPartVisitor {
    /**
     * 访问电脑各个部分
     * @param computer 电脑
     */
    void visit(Computer computer);

    /**
     * 访问电脑各个部分
     * @param mouse 鼠标
     */
    void visit(Mouse mouse);

    /**
     * 访问电脑各个部分
     * @param keyboard 键盘
     */
    void visit(Keyboard keyboard);

    /**
     * 访问电脑各个部分
     * @param monitor 显示器
     */
    void visit(Monitor monitor);
}
