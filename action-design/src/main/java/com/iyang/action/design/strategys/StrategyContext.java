package com.iyang.action.design.strategys;

/**
 * Created by Yang on 2021/2/9 23:22
 */

public class StrategyContext {

    private Strategy strategy;

    public StrategyContext(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStragegy(int num1,int num2){
        return strategy.deOperation(num1, num2);
    }

}
