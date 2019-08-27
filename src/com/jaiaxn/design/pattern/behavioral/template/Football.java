package com.jaiaxn.design.pattern.behavioral.template;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月27日
 * @description:
 **/
public class Football extends Game {
    @Override
    void initialize() {
        System.out.println("Football Game initialized!");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game started!");
    }

    @Override
    void endPlay() {
        System.out.println("Football Game Finished!");
    }
}
