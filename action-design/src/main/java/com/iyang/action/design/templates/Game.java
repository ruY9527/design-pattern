package com.iyang.action.design.templates;

/**
 * Created by Yang on 2021/2/9 23:38
 *
 * 一些通用的方法,没必要在子类上都实现一遍 , 这也是该模式主要处理的问题.
 * 封装不变部分,扩展可变的部分.  提取公共代码,便于维护.
 */

public abstract class Game {

    public void commonStart(){
        System.out.println("通用开始方法");
    }

    public void commonEnd(){
        System.out.println("通用结束方法");
    }

    abstract void initialize();

    abstract void startPlay();

    abstract void endPlay();

    /**
     * 方法还可以预留钩子来进行实现
     */
    public final void play(){
        commonStart();

        // 初始化
        initialize();
        // 开始游戏
        startPlay();
        // 结束游戏
        endPlay();

        commonEnd();
    }

}
