package com.jaiaxn.design.pattern.behavioral.visitor;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月27日
 * @description:
 **/
public interface ComputerPart {

    /**
     * 访问电脑各个部分
     * @param computerPartVisitor
     */
    void accept(ComputerPartVisitor computerPartVisitor);
}
