package com.jaiaxn.design.pattern.behavioral.interpreter;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月27日
 * @description:
 **/
public class TerminalExpression implements Expression {

    private String date;

    public TerminalExpression(String date) {
        this.date = date;
    }

    @Override
    public boolean interpret(String context) {
        return context.contains(date);
    }
}
