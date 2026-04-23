package com.iyang.action.design.strategys;

/**
 * 策略接口
 * <p>
 * 策略模式核心：定义一系列算法，把它们封装起来，并使它们可以相互替换。
 * 策略模式让算法独立于使用它的客户端而变化。
 * </p>
 *
 * @author Yang
 * @since 2021/2/9
 */
public interface Strategy {

    /**
     * 执行策略操作
     *
     * @param num1 第一个操作数
     * @param num2 第二个操作数
     * @return 操作结果
     */
    int doOperation(int num1, int num2);
}
