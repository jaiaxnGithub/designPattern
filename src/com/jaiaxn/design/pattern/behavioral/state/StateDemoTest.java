package com.jaiaxn.design.pattern.behavioral.state;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月27日
 * @description: 状态模式
 **/
public class StateDemoTest {
    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
    // Player is in start state
    // Start State
    // Player is in stop state
    // Stop State
}
