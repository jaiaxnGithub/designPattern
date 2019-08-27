package com.jaiaxn.design.pattern.structured.filter;

import java.util.List;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月26日
 * @description:
 **/
public class OrCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria){
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<HeroMan> getHeroMans(List<HeroMan> heroMans) {
        List<HeroMan> firstCriteriaItems = criteria.getHeroMans(heroMans);
        List<HeroMan> otherCriteriaItems = otherCriteria.getHeroMans(heroMans);

        // 过滤英雄
        for (HeroMan person : otherCriteriaItems) {
            if(!firstCriteriaItems.contains(person)){
                firstCriteriaItems.add(person);
            }
        }
        return firstCriteriaItems;
    }
}
