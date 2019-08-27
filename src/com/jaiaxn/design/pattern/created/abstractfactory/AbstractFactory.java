package com.jaiaxn.design.pattern.created.abstractfactory;

import com.jaiaxn.design.pattern.created.abstractfactory.equipment.Equipment;
import com.jaiaxn.design.pattern.created.factory.hero.HeroMan;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月16日
 * @description:
 **/
public abstract class AbstractFactory {
    /**
     * 获取装备属性
     *
     * @param equipmentName 装备名称
     * @return 装备属性
     */
    public abstract Equipment getEquipment(String equipmentName);

    /**
     * 获取英雄
     *
     * @param heroPosition 英雄位置
     * @return 英雄
     */
    public abstract HeroMan getHero(String heroPosition);
}
