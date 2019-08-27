package com.jaiaxn.design.pattern.structured.facade;

import com.jaiaxn.design.pattern.structured.decorator.HeroMan;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月26日
 * @description:
 **/
public class AKaLI implements HeroMan {
    @Override
    public void skill() {
        System.out.println("阿卡丽：我流秘奥义！表里杀缭乱");
    }
}
