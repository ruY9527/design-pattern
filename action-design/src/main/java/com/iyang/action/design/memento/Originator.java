package com.iyang.action.design.memento;

/**
 * Created by Yang on 2021/2/8 22:23
 */

public class Originator {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento saveStateToMemento(){
        return new Memento(state);
    }

    public void setStateFromMemento(Memento memento){
        state = memento.getState();
    }
}
