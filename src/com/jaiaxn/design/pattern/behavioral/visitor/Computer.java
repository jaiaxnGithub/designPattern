package com.jaiaxn.design.pattern.behavioral.visitor;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月27日
 * @description:
 **/
public class Computer implements ComputerPart {

    ComputerPart[] parts;

    public Computer(){
        parts = new ComputerPart[] {new Mouse(), new Keyboard(), new Monitor()};
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for(ComputerPart part : parts){
            part.accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
