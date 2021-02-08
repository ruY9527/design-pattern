package com.iyang.action.design.mediators;

import java.util.Date;

/**
 * Created by Yang on 2021/2/8 22:02
 */

public class ChatRoom {

    public static void showMessage(User user,String message){

        System.out.println(new Date().toString() + " [ " + user.getName() + " : " + message + " ]");

    }

}
