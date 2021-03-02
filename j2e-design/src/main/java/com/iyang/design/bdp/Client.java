package com.iyang.design.bdp;

/**
 * Created by Yang on 2021/3/2 22:56
 */

public class Client {

    BusinessDelegate businessDelegate;

    public Client(BusinessDelegate businessDelegate){
        this.businessDelegate = businessDelegate;
    }

    public void doTask(){
        businessDelegate.doTask();
    }

}
