package com.jaiaxn.design.pattern.structured.facade;

import com.jaiaxn.design.pattern.structured.decorator.HeroMan;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月26日
 * @description:
 **/
public class Jie implements HeroMan {
    @Override
    public void skill() {
        System.out.println("劫：禁奥义！瞬狱影杀阵");
    }
}
