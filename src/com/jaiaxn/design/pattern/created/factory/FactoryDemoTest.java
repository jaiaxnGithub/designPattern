package com.jaiaxn.design.pattern.created.factory;

import com.jaiaxn.design.pattern.created.factory.hero.HeroMan;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月16日
 * @description: 工厂模式
 **/
public class FactoryDemoTest {
    public static void main(String[] args) {
        HeroFactory heroFactory = new HeroFactory();

        HeroMan top = heroFactory.getHero("TOP");
        top.play();

        HeroMan jug = heroFactory.getHero("JUG");
        jug.play();

        HeroMan mid = heroFactory.getHero("MID");
        mid.play();

        HeroMan adc = heroFactory.getHero("ADC");
        adc.play();

        HeroMan sup = heroFactory.getHero("SUP");
        sup.play();
    }
    // 输出
    // 海洋之灾普朗克-上单
    // 盲僧李青-打野
    // 疾风剑豪压缩-中单
    // 暗夜猎手薇恩-射手
    // 魂锁典狱长锤石-辅助
}
