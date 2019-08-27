package com.jaiaxn.design.pattern.structured.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月26日
 * @description:
 **/
public class Bravo implements Criteria {
    @Override
    public List<HeroMan> getHeroMans(List<HeroMan> heroMans) {
        List<HeroMan> heroManList = new ArrayList<>();
        if(null != heroMans && heroMans.size() > 0){
            heroMans.forEach(item ->{
                if(HeroManType.HERO_MAN_BRAVO.equalsIgnoreCase(item.getType())){
                    heroManList.add(item);
                }
            });
        }
        return heroManList;
    }
}
