package com.jaiaxn.design.pattern.created.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月16日
 * @description:
 **/
public class Computer {
    private List<String> computerParts = new ArrayList<>();

    public void buildParts(String part) {
        computerParts.add(part);
    }

    public void printComputer(){
        if (computerParts.size() > 0) {
            computerParts.forEach(System.out::println);
            System.out.println("电脑装机完毕...");
        }
    }
}
