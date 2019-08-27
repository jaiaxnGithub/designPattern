package com.jaiaxn.design.pattern.structured.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月26日
 * @description:
 **/
public class HeroMan {
    private String name;
    private String position;
    private List<HeroMan> subHeroMans;

    public HeroMan(String name, String position) {
        this.name = name;
        this.position = position;
        this.subHeroMans = new ArrayList<>();
    }

    public void add(HeroMan heroMan){
        this.subHeroMans.add(heroMan);
    }

    public void remove(HeroMan heroMan){
        this.subHeroMans.remove(heroMan);
    }

    public List<HeroMan> getSubHeroMans() {
        return this.subHeroMans;
    }

    @Override
    public String toString() {
        return "HeroMan{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", subHeroMans=" + subHeroMans +
                '}';
    }
}
