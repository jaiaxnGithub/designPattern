package com.jaiaxn.design.pattern.behavioral.template;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月27日
 * @description:
 **/
public class Basketball extends Game {
    @Override
    void initialize() {
        System.out.println("Basketball Game initialized!");
    }

    @Override
    void startPlay() {
        System.out.println("Basketball Game started!");
    }

    @Override
    void endPlay() {
        System.out.println("Basketball Game Finished!");
    }
}
