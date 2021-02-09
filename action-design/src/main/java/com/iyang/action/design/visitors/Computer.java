package com.iyang.action.design.visitors;

/**
 * Created by Yang on 2021/2/10 0:13
 */

public class Computer implements ComputerPart {

    ComputerPart [] parts;

    public Computer(){
        this.parts = new ComputerPart[] { new Mouse(),new Keyboard(),new Monitor() };
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {

        for(ComputerPart part : parts){
            part.accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
