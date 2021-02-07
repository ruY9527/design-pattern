package com.iyang.action.design.interpreters;

/**
 * Created by Yang on 2021/2/7 21:29
 */

public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data){
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if(context.contains(data)){
            return true;
        }
        return false;
    }

}
