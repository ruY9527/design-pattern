package com.iyang.action.design.templates;

/**
 * 板球游戏 - 模板方法模式具体实现
 * <p>
 * 实现游戏抽象类中定义的抽象方法，完成板球游戏的具体逻辑
 * </p>
 *
 * @author Yang
 * @since 2021/2/9
 */
public class Cricket extends Game {

    @Override
    protected void initialize() {
        System.out.println("【板球】初始化：准备场地、检查设备、组建队伍");
    }

    @Override
    protected void startPlay() {
        System.out.println("【板球】开始游戏：投球、击球、跑垒");
    }

    @Override
    protected void endPlay() {
        System.out.println("【板球】结束游戏：统计得分、宣布胜负");
    }
}
