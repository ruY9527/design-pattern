package com.iyang.action.design.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yang on 2021/2/8 22:26
 */

public class CareTaker {

    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }

}
