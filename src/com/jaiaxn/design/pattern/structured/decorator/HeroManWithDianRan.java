package com.jaiaxn.design.pattern.structured.decorator;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月26日
 * @description:
 **/
public class HeroManWithDianRan extends HeroManDecorator {
    public HeroManWithDianRan(HeroMan heroMan) {
        super(heroMan);
    }

    @Override
    public void skill(){
        heroMan.skill();
        dianRan();
    }

    /**
     * 特有技能：点燃
     */
    private void dianRan(){
        System.out.print("，点燃");
    }
}
