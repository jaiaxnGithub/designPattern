package com.jaiaxn.design.pattern.structured.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月26日
 * @description:
 **/
public class ShoeFactory {
    private static final Map<String, IShoe> shoesMap = new HashMap<>();

    public static IShoe getShoe(String name){
        IShoe shoe = shoesMap.get(name);

        if (null == shoe) {
            shoe = new Shoe(name);
            shoesMap.put(name, shoe);
        }

        return shoe;
    }
}
