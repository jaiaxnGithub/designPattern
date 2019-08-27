package com.jaiaxn.design.pattern.behavioral.state;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月27日
 * @description:
 **/
public class Context {
    private State state;

    public Context(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}
