package com.iyang.action.design.nullobject;

/**
 * Created by Yang on 2021/2/9 23:06
 */

public class NullCustomer extends AbstractCustomer {
    @Override
    public boolean isNull() {
        return true;
    }

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }
}
