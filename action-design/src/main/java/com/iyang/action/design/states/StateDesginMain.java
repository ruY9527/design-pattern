package com.iyang.action.design.states;

/**
 * Created by Yang on 2021/3/1 22:49
 *
 *  状态设计模式 :  类的行为是基于它的状态进行改变的
 *  创建表示各种状态的对象和一个行为随着状态对象改变而改变的context对象.
 *
 */

public class StateDesginMain {

    public static void main(String[] args) {

        Context context  = new Context();
        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);
        System.out.println(context.getState().toString());

    }

}
