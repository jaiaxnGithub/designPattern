package com.jaiaxn.design.pattern.structured.composite;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月26日
 * @description: 组合（部分整体）模式
 **/
public class CompositeDemoTest {
    public static void main(String[] args) {
        HeroMan top = new HeroMan("上单", "上单");

        HeroMan nuoKe = new HeroMan("德莱厄斯", "上单");
        top.add(nuoKe);
        HeroMan jianMo = new HeroMan("亚托克斯", "上单");
        top.add(jianMo);
        HeroMan deMa = new HeroMan("盖伦", "上单");
        top.add(deMa);

        System.out.println(top.getSubHeroMans());
    }
    // [HeroMan{name='德莱厄斯', position='上单', subHeroMans=[]},
    // HeroMan{name='亚托克斯', position='上单', subHeroMans=[]},
    // HeroMan{name='盖伦', position='上单', subHeroMans=[]}]
}
