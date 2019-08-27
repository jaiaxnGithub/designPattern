package com.jaiaxn.design.pattern.structured.adapter;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月22日
 * @description:
 **/
public class JinShenAdapter extends JinShen implements HeroMan {
    @Override
    public void play() {
        super.skillActived();
    }
}
