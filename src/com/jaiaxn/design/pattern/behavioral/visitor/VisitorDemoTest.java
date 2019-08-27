package com.jaiaxn.design.pattern.behavioral.visitor;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月27日
 * @description: 访问者模式
 **/
public class VisitorDemoTest {
    public static void main(String[] args){
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
    // Displaying Mouse.
    // Displaying Keyboard.
    // Displaying Monitor.
    // Displaying Computer.
}
