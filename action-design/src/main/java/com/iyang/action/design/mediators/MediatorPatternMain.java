package com.iyang.action.design.mediators;

/**
 * Created by Yang on 2021/2/8 22:09
 *
 * 中介者模式 :  降低类的复杂度,将一对多的关系转变为一对一的关系.
 *             各个类之间解耦.
 */

public class MediatorPatternMain {

    public static void main(String[] args) {

        User rebert = new User("Rebort");
        User john = new User("john");
        rebert.sendMessage("Hi!This is Rebert.....");
        john.sendMessage("Hi!This is john.....");

    }

}
