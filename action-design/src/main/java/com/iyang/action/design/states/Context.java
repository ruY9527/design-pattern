package com.iyang.action.design.states;

/**
 * Created by Yang on 2021/3/1 22:45
 */

public class Context {

    private State state;

    public Context(){
        state = null;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
