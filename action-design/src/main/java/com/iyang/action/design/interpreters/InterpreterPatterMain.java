package com.iyang.action.design.interpreters;

/**
 * Created by Yang on 2021/2/7 21:35
 *
 * 解释器模式.
 * 评估语言的语法或表达式的方式. 属于行为型模式,
 */

public class InterpreterPatterMain {

    public static Expression getMaleExpression(){
        Expression rebort = new TerminalExpression("Rebert");
        Expression john = new TerminalExpression("john");
        return new OrExpression(rebort,john);
    }

    public static Expression getMarriedWomanExpression(){
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie,married);
    }

    public static void main(String[] args) {

        Expression maleExpression = getMaleExpression();
        Expression marriedWomanExpression = getMarriedWomanExpression();

        System.out.println("John is male? " + maleExpression.interpret("john"));
        System.out.println("Juile is married women ? " + marriedWomanExpression.interpret("Married Julie"));


    }

}
