package com.jaiaxn.design.pattern.behavioral.memento;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月27日
 * @description: 备忘录模式
 **/
public class MementoDemoTest {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        originator.setState("State #1");
        originator.setState("State #2");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #3");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #4");

        System.out.println("Current State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First saved State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second saved State: " + originator.getState());
    }
    // Current State: State #4
    // First saved State: State #2
    // Second saved State: State #3
}
