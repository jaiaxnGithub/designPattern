package com.jaiaxn.design.pattern.created.abstractfactory;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月16日
 * @description:
 **/
public class FactoryProducer {
    public static AbstractFactory getAbstractFactory(String choice) {
        if ("".equals(choice)) {
            return null;
        }
        if ("equipment".equalsIgnoreCase(choice)) {
            return new EquipmentFactory();
        } else if ("hero".equalsIgnoreCase(choice)) {
            return new HeroFactory();
        }
        return null;
    }
}
