package com.iyang.action.design.strategys;

/**
 * 策略上下文
 * <p>
 * 上下文类维护对策略对象的引用，并在运行时可以切换策略。
 * 客户端通过上下文类来调用策略的具体实现。
 * </p>
 *
 * @author Yang
 * @since 2021/2/9
 */
public class StrategyContext {

    private Strategy strategy;

    public StrategyContext(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 执行当前策略
     *
     * @param num1 第一个操作数
     * @param num2 第二个操作数
     * @return 策略执行结果
     */
    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }

    /**
     * 切换策略
     *
     * @param strategy 新的策略
     */
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
