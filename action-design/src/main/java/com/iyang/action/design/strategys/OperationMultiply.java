package com.iyang.action.design.strategys;

/**
 * Created by Yang on 2021/2/9 23:20
 */

public class OperationMultiply  implements Strategy {

    @Override
    public int deOperation(int num1, int num2) {
        return num1 * num2;
    }

}
