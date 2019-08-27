package com.jaiaxn.design.pattern.structured.facade;

import com.jaiaxn.design.pattern.structured.decorator.HeroMan;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月26日
 * @description:
 **/
public class HeroManMaker {
    private HeroMan jie;
    private HeroMan kaiNan;
    private HeroMan aKaLi;

    public HeroManMaker() {
        jie = new Jie();
        kaiNan = new KaiNan();
        aKaLi = new AKaLI();
    }

    public void jieFinalSkill(){
        jie.skill();
    }

    public void kaiNanFinalSkill(){
        kaiNan.skill();
    }

    public void aKaLiFinalSkill(){
        aKaLi.skill();
    }
}
