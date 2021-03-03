package com.iyang.design.filters;

/**
 * Created by Yang on 2021/3/3 22:54
 */

public class AuthenticationFilter implements Filter {

    @Override
    public void execute(String request) {
        System.out.println("Authenticating request: " + request);
    }

}
