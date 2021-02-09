package com.iyang.action.design.templates;

/**
 * Created by Yang on 2021/2/9 23:43
 */

public class Cricket extends Game {
    @Override
    void initialize() {
        System.out.println("Cricket 初始化游戏");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket 开始游戏");
    }

    @Override
    void endPlay() {
        System.out.println("Cricket 结束游戏");
    }
}
