package com.iyang.action.design.mediators;

/**
 * Created by Yang on 2021/2/8 22:02
 */

public class User {

    private String name;

    public void sendMessage(String message){
        ChatRoom.showMessage(this,message);
    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
