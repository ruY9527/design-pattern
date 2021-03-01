package com.iyang.action.design.states;

/**
 * Created by Yang on 2021/3/1 22:48
 */

public class StopState implements State {

    @Override
    public void doAction(Context context) {

        System.out.println("Action in StopState Class");
        context.setState(this);

    }

    @Override
    public String toString() {
        return "Stop State....";
    }
}
