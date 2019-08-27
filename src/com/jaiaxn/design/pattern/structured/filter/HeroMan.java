package com.jaiaxn.design.pattern.structured.filter;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月26日
 * @description:
 **/
public class HeroMan {
    private String name;
    private String type;

    public HeroMan(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "HeroMan{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
