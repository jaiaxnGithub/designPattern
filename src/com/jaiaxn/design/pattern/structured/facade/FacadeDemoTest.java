package com.jaiaxn.design.pattern.structured.facade;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月26日
 * @description: 外观模式
 **/
public class FacadeDemoTest {
    public static void main(String[] args) {
        HeroManMaker heroManMaker = new HeroManMaker();

        heroManMaker.jieFinalSkill();
        heroManMaker.kaiNanFinalSkill();
        heroManMaker.aKaLiFinalSkill();
    }
    // 劫：禁奥义！瞬狱影杀阵
    // 凯南：秘奥义！万雷天牢引
    // 阿卡丽：我流秘奥义！表里杀缭乱
}
