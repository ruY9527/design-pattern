package com.iyang.action.design.states;

/**
 * Created by Yang on 2021/3/1 22:46
 */

public class StartState implements State {

    @Override
    public void doAction(Context context) {

        System.out.println("Action in StartState Class");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Start State....";
    }
}
