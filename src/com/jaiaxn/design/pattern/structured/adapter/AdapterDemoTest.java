package com.jaiaxn.design.pattern.structured.adapter;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月22日
 * @description: 适配器模式
 **/
public class AdapterDemoTest {
    public static void main(String[] args){
        HeroMan heroMan = new HeroManImpl();
        heroMan.play();

        JinShenAdapter heroPlayJinShen = new JinShenAdapter();
        heroPlayJinShen.play();
    }
    // 使用装备主动技能
    // 使用中娅沙漏的唯一主动—凝滞：让英雄在2.5秒里免疫任何伤害且无法被选定，但无法移动、攻击、施放技能或使用装备（冷却时间120秒）
}
