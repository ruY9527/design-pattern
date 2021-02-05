package com.iyang.action.design.command;

import com.sun.org.apache.xpath.internal.operations.Or;

/**
 * Created by Yang on 2021/2/5 23:42
 */

public class BuyStock implements Order {

    private Stock abcStock;

    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    @Override
    public void execute(){
        abcStock.buy();
    }

}
