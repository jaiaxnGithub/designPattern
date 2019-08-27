package com.jaiaxn.design.pattern.created.prototype;

import com.jaiaxn.design.pattern.created.prototype.bravo.Bravo;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月21日
 * @description:
 **/
public class BravoCache {

    public static Map<String, Bravo> bravoMap = new HashMap<>(3);

    /**
     * 返回克隆对象
     *
     * @param name name
     * @return
     */
    public static Bravo getBravo(String name) {
        Bravo bravo = bravoMap.get(name);
        return (Bravo) bravo.clone();
    }

}
