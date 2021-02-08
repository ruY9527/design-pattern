package com.iyang.action.design.memento;

/**
 * Created by Yang on 2021/2/8 22:22
 */

public class Memento {

    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
