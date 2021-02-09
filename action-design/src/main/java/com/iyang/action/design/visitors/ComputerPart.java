package com.iyang.action.design.visitors;

/**
 * Created by Yang on 2021/2/10 0:08
 */

public interface ComputerPart {

    void accept(ComputerPartVisitor computerPartVisitor);

}
