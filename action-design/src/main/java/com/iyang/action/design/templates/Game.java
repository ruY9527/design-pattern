package com.iyang.action.design.templates;

/**
 * 游戏抽象类 - 模板方法模式
 * <p>
 * 模板方法模式核心思想：
 * 定义一个操作中的算法骨架，将某些步骤延迟到子类中实现。
 * 模板方法使得子类可以在不改变算法结构的情况下，重新定义算法的某些步骤。
 * </p>
 * <p>
 * 优点：
 * 1. 封装不变部分，扩展可变部分
 * 2. 提取公共代码，便于维护
 * 3. 行为由父类控制，子类实现细节
 * </p>
 *
 * @author Yang
 * @since 2021/2/9
 */
public abstract class Game {

    /**
     * 通用开始方法（可被子类覆盖的钩子方法）
     */
    protected void commonStart() {
        System.out.println("=== 游戏通用开始流程 ===");
    }

    /**
     * 通用结束方法（可被子类覆盖的钩子方法）
     */
    protected void commonEnd() {
        System.out.println("=== 游戏通用结束流程 ===");
    }

    /**
     * 初始化游戏（抽象方法，由子类实现）
     */
    protected abstract void initialize();

    /**
     * 开始游戏（抽象方法，由子类实现）
     */
    protected abstract void startPlay();

    /**
     * 结束游戏（抽象方法，由子类实现）
     */
    protected abstract void endPlay();

    /**
     * 模板方法 - 定义游戏流程骨架
     * <p>
     * 使用 final 关键字防止子类覆盖模板方法
     * </p>
     */
    public final void play() {
        // 通用开始流程
        commonStart();

        // 核心游戏流程
        initialize();
        startPlay();
        endPlay();

        // 通用结束流程
        commonEnd();
    }
}
