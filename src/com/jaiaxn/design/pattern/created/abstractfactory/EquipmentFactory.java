package com.jaiaxn.design.pattern.created.abstractfactory;

import com.jaiaxn.design.pattern.created.abstractfactory.constant.EquipmentNameConstant;
import com.jaiaxn.design.pattern.created.abstractfactory.equipment.Equipment;
import com.jaiaxn.design.pattern.created.abstractfactory.equipment.EquipmentWuJin;
import com.jaiaxn.design.pattern.created.abstractfactory.equipment.EquipmentXieZi;
import com.jaiaxn.design.pattern.created.factory.hero.*;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月16日
 * @description:
 **/
public class EquipmentFactory extends AbstractFactory {

    @Override
    public Equipment getEquipment(String equipmentName) {
        if ("".equals(equipmentName)) {
            return null;
        }
        if (EquipmentNameConstant.EQUIPMENT_XIEZI.equals(equipmentName)) {
            return new EquipmentXieZi();
        } else if (EquipmentNameConstant.EQUIPMENT_WUJIN.equals(equipmentName)) {
            return new EquipmentWuJin();
        }
        return null;
    }

    @Override
    public HeroMan getHero(String heroPosition) {
        return null;
    }
}
