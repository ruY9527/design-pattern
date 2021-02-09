package com.iyang.action.design.visitors;

/**
 * Created by Yang on 2021/2/10 0:13
 */

public class Mouse implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
