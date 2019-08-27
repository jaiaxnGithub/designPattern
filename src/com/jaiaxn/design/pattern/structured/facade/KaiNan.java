package com.jaiaxn.design.pattern.structured.facade;

import com.jaiaxn.design.pattern.structured.decorator.HeroMan;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月26日
 * @description:
 **/
public class KaiNan implements HeroMan {
    @Override
    public void skill() {
        System.out.println("凯南：秘奥义！万雷天牢引");
    }
}
