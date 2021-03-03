package com.iyang.design.filters;

/**
 * Created by Yang on 2021/3/3 23:04
 */

public class FilterManager {

    FilterChain filterChain;

    public FilterManager(Target target) {
        this.filterChain = new FilterChain();
        filterChain.setTarget(target);
    }

    public void setFilter(Filter filter){
        this.filterChain.addFilter(filter);
    }

    public void filterRequest(String request){
        filterChain.execute(request);
    }

}
