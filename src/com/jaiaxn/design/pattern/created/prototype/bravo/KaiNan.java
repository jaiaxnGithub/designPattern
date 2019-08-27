package com.jaiaxn.design.pattern.created.prototype.bravo;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月21日
 * @description:
 **/
public class KaiNan extends Bravo {

    public KaiNan() {
        skill = "秘奥义！万雷天牢引";
    }

    @Override
    public void play() {
        System.out.println("凯南大招：秘奥义！万雷天牢引");
    }
}
