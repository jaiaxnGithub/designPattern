package com.jaiaxn.design.pattern.structured.filter;

import java.util.List;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月26日
 * @description:
 **/
public interface Criteria {
    /**
     * 获取英雄
     * @param heroMans 英雄
     * @return 英雄list
     */
    List<HeroMan> getHeroMans(List<HeroMan> heroMans);
}
