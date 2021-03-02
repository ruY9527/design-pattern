package com.iyang.design.bdp;

/**
 * Created by Yang on 2021/3/2 22:49
 */

public class BusinessLookUp {

    public BusinessService getBusinessService(String serviceType){
        if("EJB".equalsIgnoreCase(serviceType)){
            return new EJBService();
        } else {
            return new JMSService();
        }
    }

}
