package com.jaiaxn.design.pattern.behavioral.mediator;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月27日
 * @description: 中介模式
 **/
public class MediatorDemoTest {
    public static void main(String[] args) {
        HeroMan yaSuo = new HeroMan("亚索");
        HeroMan xiaZi = new HeroMan("李青");

        yaSuo.sendMessage("哈撒给！");
        xiaZi.sendMessage("一库！");
    }
    // Tue Aug 27 10:02:56 CST 2019 [亚索] : 哈撒给！
    // Tue Aug 27 10:02:56 CST 2019 [李青] : 一库！
}
