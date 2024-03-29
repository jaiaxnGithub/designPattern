package com.jaiaxn.design.pattern.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月27日
 * @description:
 **/
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}
