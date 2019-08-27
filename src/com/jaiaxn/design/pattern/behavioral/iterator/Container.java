package com.jaiaxn.design.pattern.behavioral.iterator;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月27日
 * @description:
 **/
public interface Container {
    /**
     * 迭代
     *
     * @return 结果
     */
    Iterator getIterator();
}
