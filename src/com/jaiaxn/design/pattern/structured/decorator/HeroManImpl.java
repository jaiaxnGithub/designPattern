package com.jaiaxn.design.pattern.structured.decorator;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月26日
 * @description:
 **/
public class HeroManImpl implements HeroMan {
    @Override
    public void skill() {
        System.out.print("技能：Q，W，E，R");
    }
}
