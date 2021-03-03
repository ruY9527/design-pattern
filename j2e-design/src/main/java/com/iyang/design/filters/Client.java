package com.iyang.design.filters;

/**
 * Created by Yang on 2021/3/3 23:08
 */

public class Client {

    FilterManager filterManager;

    public void setFilterManager(FilterManager filterManager){
        this.filterManager = filterManager;
    }

    public void sendRequest(String request){
        filterManager.filterRequest(request);
    }

}
