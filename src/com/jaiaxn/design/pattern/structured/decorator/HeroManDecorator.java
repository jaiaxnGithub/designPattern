package com.jaiaxn.design.pattern.structured.decorator;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月26日
 * @description:
 **/
public class HeroManDecorator implements HeroMan {
    protected HeroMan heroMan;

    public HeroManDecorator(HeroMan heroMan) {
        this.heroMan = heroMan;
    }

    @Override
    public void skill() {
        heroMan.skill();
    }
}
