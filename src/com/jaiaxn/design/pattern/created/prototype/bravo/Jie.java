package com.jaiaxn.design.pattern.created.prototype.bravo;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月21日
 * @description:
 **/
public class Jie extends Bravo {

    public Jie() {
        skill = "禁奥义！瞬狱影杀阵";
    }

    @Override
    public void play() {
        System.out.println("劫大招：禁奥义！瞬狱影杀阵");
    }
}
