package com.jaiaxn.design.pattern.behavioral.template;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月27日
 * @description:
 **/
public abstract class Game {
    /**
     * 初始化游戏
     */
    abstract void initialize();

    /**
     * 开始游戏
     */
    abstract void startPlay();

    /**
     *结束游戏
     */
    abstract void endPlay();

    /**
     * 模板
     */
    public final void play(){
        initialize();
        startPlay();
        endPlay();
    }
}
