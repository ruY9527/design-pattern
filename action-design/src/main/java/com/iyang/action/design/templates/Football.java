package com.iyang.action.design.templates;

/**
 * Created by Yang on 2021/2/9 23:49
 */

public class Football extends Game {
    @Override
    void initialize() {
        System.out.println("Football 初始化操作");
    }

    @Override
    void startPlay() {
        System.out.println("Football 开始游戏操作");
    }

    @Override
    void endPlay() {
        System.out.println("Football 结束游戏操作");
    }

    @Override
    public void commonStart() {
        // super.commonStart();
        System.out.println("添加多的一个template方法编写");
    }
}
