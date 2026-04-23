package com.iyang.action.design.strategys;

/**
 * 乘法策略
 * <p>
 * 实现乘法运算的具体策略类
 * </p>
 *
 * @author Yang
 * @since 2021/2/9
 */
public class OperationMultiply implements Strategy {

    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }

}
