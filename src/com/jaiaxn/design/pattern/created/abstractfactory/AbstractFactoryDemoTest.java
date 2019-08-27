package com.jaiaxn.design.pattern.created.abstractfactory;


import com.jaiaxn.design.pattern.created.abstractfactory.equipment.Equipment;
import com.jaiaxn.design.pattern.created.factory.hero.HeroMan;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月16日
 * @description: 抽象工厂模式
 **/
public class AbstractFactoryDemoTest {
    public static void main(String[] args) {
        AbstractFactory equipmentFactory = FactoryProducer.getAbstractFactory("equipment");
        Equipment xieZi = equipmentFactory.getEquipment("XIEZI");
        xieZi.attribute();
        Equipment wuJin = equipmentFactory.getEquipment("WUJIN");
        wuJin.attribute();

        AbstractFactory heroFactory = FactoryProducer.getAbstractFactory("hero");
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
    // 鞋子--移速、抗性
    // 无尽--攻击、暴击
    // 海洋之灾普朗克-上单
    // 盲僧李青-打野
    // 疾风剑豪压缩-中单
    // 暗夜猎手薇恩-射手
    // 魂锁典狱长锤石-辅助
}
