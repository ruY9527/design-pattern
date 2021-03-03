package com.iyang.design.filters;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yang on 2021/3/3 23:00
 */

public class FilterChain {

    private List<Filter> filters = new ArrayList<>();
    private Target target;

    public void addFilter(Filter filter){
        this.filters.add(filter);
    }

    public void execute(String request){
        filters.stream().forEach(filter -> filter.execute(request));
        target.execute(request);
    }

    public void setTarget(Target target) {
        this.target = target;
    }
}
