package com.iyang.action.design.templates;

/**
 * 足球游戏 - 模板方法模式具体实现
 * <p>
 * 实现游戏抽象类中定义的抽象方法，并覆盖钩子方法展示自定义流程
 * </p>
 *
 * @author Yang
 * @since 2021/2/9
 */
public class Football extends Game {

    @Override
    protected void initialize() {
        System.out.println("【足球】初始化：准备球场、检查球门、组建队伍");
    }

    @Override
    protected void startPlay() {
        System.out.println("【足球】开始游戏：传球、射门、防守");
    }

    @Override
    protected void endPlay() {
        System.out.println("【足球】结束游戏：统计比分、宣布胜负");
    }

    /**
     * 钩子方法覆盖 - 自定义开始流程
     * <p>
     * 展示模板方法模式的灵活性：子类可以选择覆盖钩子方法
     * </p>
     */
    @Override
    protected void commonStart() {
        System.out.println("=== 足球比赛特别流程 ===");
        System.out.println("裁判检查场地...");
        System.out.println("双方队伍入场...");
    }
}
