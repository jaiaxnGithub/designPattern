package com.jaiaxn.design.pattern.structured.flyweight;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月26日
 * @description:
 **/
public class Shoe implements IShoe {
    private String name;

    public Shoe(String name){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public void printShoeName() {
        System.out.println(name);
    }
}
