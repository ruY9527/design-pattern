package com.iyang.design.filters;

/**
 * Created by Yang on 2021/3/3 23:13
 */

public class InterceptingFilterDemo {

    public static void main(String[] args) {

        FilterManager filterManager = new FilterManager(new Target());
        filterManager.setFilter(new AuthenticationFilter());
        filterManager.setFilter(new DebugFilter());

        Client client = new Client();
        client.setFilterManager(filterManager);
        client.sendRequest("HOME");

    }

}
