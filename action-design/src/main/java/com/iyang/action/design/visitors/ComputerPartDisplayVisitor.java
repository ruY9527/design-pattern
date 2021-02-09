package com.iyang.action.design.visitors;

/**
 * Created by Yang on 2021/2/10 0:19
 */

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {
    @Override
    public void visit(Computer computer) {
        System.out.println("Do it in computer");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Do it in mouse");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Do it in ketboard");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Do it in monitor");
    }
}
