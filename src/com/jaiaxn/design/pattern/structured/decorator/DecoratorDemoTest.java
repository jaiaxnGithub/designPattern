package com.jaiaxn.design.pattern.structured.decorator;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月26日
 * @description: 装饰器模式
 **/
public class DecoratorDemoTest {
    public static void main(String[] args) {
        HeroMan normalHeroMan = new HeroManImpl();
        normalHeroMan.skill();

        System.out.println();

        HeroMan dianRanHeroMan = new HeroManWithDianRan(new HeroManImpl());
        dianRanHeroMan.skill();
    }
    // 技能：Q，W，E，R
    // 技能：Q，W，E，R，点燃
}
