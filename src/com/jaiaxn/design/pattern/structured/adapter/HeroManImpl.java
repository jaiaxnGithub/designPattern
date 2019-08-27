package com.jaiaxn.design.pattern.structured.adapter;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月22日
 * @description:
 **/
public class HeroManImpl implements HeroMan {
    @Override
    public void play() {
        System.out.println("使用装备主动技能");
    }
}
