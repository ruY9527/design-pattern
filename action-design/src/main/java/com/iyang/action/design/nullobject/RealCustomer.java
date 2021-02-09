package com.iyang.action.design.nullobject;

/**
 * Created by Yang on 2021/2/9 23:05
 */

public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public boolean isNull() {
        return false;
    }

    @Override
    public String getName() {
        return null;
    }
}
