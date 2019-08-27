package com.jaiaxn.design.pattern.behavioral.template;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月27日
 * @description: 模板模式
 **/
public class TemplateDemoTest {
    public static void main(String[] args) {
        new Basketball().play();
        new Football().play();
    }
    // Basketball Game initialized!
    // Basketball Game started!
    // Basketball Game Finished!
    // Football Game initialized!
    // Football Game started!
    // Football Game Finished!
}
