package com.jaiaxn.design.pattern.created.prototype.bravo;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月21日
 * @description:
 **/
public class AKaLi extends Bravo {

    public AKaLi() {
        skill = "我流秘奥义！表里杀缭乱";
    }

    @Override
    public void play() {
        System.out.println("阿卡丽大招：我流秘奥义！表里杀缭乱");
    }
}
