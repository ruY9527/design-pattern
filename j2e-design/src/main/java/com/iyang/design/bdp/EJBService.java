package com.iyang.design.bdp;

/**
 * Created by Yang on 2021/3/2 22:48
 */

public class EJBService implements BusinessService {

    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking EJB Service");
    }

}
