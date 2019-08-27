package com.jaiaxn.design.pattern.behavioral.observer;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月27日
 * @description: 观察者模式
 **/
public class ObserverDemoTest {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        subject.setState(15);
        subject.setState(10);
    }
    // Hex String: F
    // Octal String: 17
    // Binary String: 1111
    // Hex String: A
    // Octal String: 12
    // Binary String: 1010
}
