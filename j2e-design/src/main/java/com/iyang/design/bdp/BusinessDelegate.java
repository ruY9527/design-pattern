package com.iyang.design.bdp;

/**
 * Created by Yang on 2021/3/2 22:51
 */

public class BusinessDelegate {

    private BusinessLookUp lookUpService = new BusinessLookUp();
    private BusinessService businessService;

    private String serviceType;

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public void doTask(){
        businessService = lookUpService.getBusinessService(serviceType);
        businessService.doProcessing();
    }

}
