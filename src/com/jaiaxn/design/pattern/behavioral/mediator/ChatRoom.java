package com.jaiaxn.design.pattern.behavioral.mediator;

import java.util.Date;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月27日
 * @description:
 **/
public class ChatRoom {
    public static void showMessage(HeroMan heroMan, String message){
        System.out.println(new Date().toString()
                + " [" + heroMan.getName() +"] : " + message);
    }
}
