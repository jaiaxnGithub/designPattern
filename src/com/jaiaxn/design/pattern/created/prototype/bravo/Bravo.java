package com.jaiaxn.design.pattern.created.prototype.bravo;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月21日
 * @description:
 **/
public class Bravo implements Cloneable{
    private String name;
    protected String skill;

    public void play(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Object clone(){
        Object clone = new Object();
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }
        return clone;
    }

}
