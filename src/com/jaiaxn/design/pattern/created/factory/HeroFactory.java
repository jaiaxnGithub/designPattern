package com.jaiaxn.design.pattern.created.factory;

import com.jaiaxn.design.pattern.created.factory.constant.HeroPositionConstant;
import com.jaiaxn.design.pattern.created.factory.hero.*;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月16日
 * @description: 工厂模式
 **/
public class HeroFactory {
    public HeroMan getHero(String heroPosition) {
        if ("".equals(heroPosition)) {
            return null;
        }
        if (HeroPositionConstant.POSITION_TOP.equals(heroPosition)) {
            return new HeroManChuanZhang();
        } else if (HeroPositionConstant.POSITION_JUG.equals(heroPosition)) {
            return new HeroManXiaZi();
        } else if (HeroPositionConstant.POSITION_MID.equals(heroPosition)) {
            return new HeroManYaSuo();
        } else if (HeroPositionConstant.POSITION_ADC.equals(heroPosition)) {
            return new HreoVN();
        } else if (HeroPositionConstant.POSITION_SUP.equals(heroPosition)) {
            return new HeroManChuiShi();
        }
        return null;
    }
}
