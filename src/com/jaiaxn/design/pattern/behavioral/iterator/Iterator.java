package com.jaiaxn.design.pattern.behavioral.iterator;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月27日
 * @description:
 **/
public interface Iterator {
    /**
     * 是否存在下一个元素
     *
     * @return 结果
     */
    boolean hasNext();

    /**
     * 返回下一个元素
     *
     * @return 下一个元素
     */
    Object next();
}
