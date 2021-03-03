package com.iyang.design.filters;

/**
 * Created by Yang on 2021/3/3 22:55
 */

public class DebugFilter implements Filter {
    @Override
    public void execute(String request) {
        System.out.println("request log: " + request);
    }
}
