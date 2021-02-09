package com.iyang.action.design.visitors;

/**
 * Created by Yang on 2021/2/10 0:09
 */

public interface ComputerPartVisitor {

    void visit(Computer computer);

    void visit(Mouse mouse);

    void visit(Keyboard keyboard);

    void visit(Monitor monitor);
}
