package com.iyang.action.design.command;

/**
 * Created by Yang on 2021/2/5 23:43
 */

public class SellStock implements Order {

    private Stock abcStock;

    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    @Override
    public void execute(){
        abcStock.sell();
    }

}
