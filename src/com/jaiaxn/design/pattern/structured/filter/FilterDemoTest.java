package com.jaiaxn.design.pattern.structured.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月26日
 * @description: 过滤器（标准）模式
 **/
public class FilterDemoTest {
    public static void main(String[] args) {
        List<HeroMan> heroManList = new ArrayList<>();
        heroManList.add(new HeroMan("劫", "bravo"));
        heroManList.add(new HeroMan("亚托克斯", "warrior"));
        heroManList.add(new HeroMan("乐芙兰", "magician"));
        heroManList.add(new HeroMan("蕾欧娜", "tank"));
        heroManList.add(new HeroMan("薇恩", "shooter"));

        System.out.println("刺客" + new Bravo().getHeroMans(heroManList));
        System.out.println("战士" + new Warrior().getHeroMans(heroManList));
        System.out.println("法师" + new Magician().getHeroMans(heroManList));
        System.out.println("肉坦" + new Tank().getHeroMans(heroManList));
        System.out.println("射手" + new Shooter().getHeroMans(heroManList));
    }
    // 刺客[HeroMan{name='劫', type='bravo'}]
    // 战士[HeroMan{name='亚托克斯', type='warrior'}]
    // 法师[HeroMan{name='乐芙兰', type='magician'}]
    // 肉坦[HeroMan{name='蕾欧娜', type='tank'}]
    // 射手[HeroMan{name='薇恩', type='shooter'}]
}
