package com.iyang.action.design.proxys;

/*****
 *  * ( •_•)                          (•_• )
 *    ( ง )ง                          ୧( ୧ )
 *    /︶\                              /︶\
 * @author : LuoHong
 * @date: 2022/1/6
 * @ProjectName: factory-design
 * @desc:
 **/

public class IFather {

    private ISon iSon;

    public IFather(ISon iSon){
        this.iSon = iSon;
    }

    public void findIt(){

        System.out.println("Father级别的开始来");
        this.iSon.findIt();
        System.out.println("匹配成功,确定ok");

    }

    public static void main(String[] args) {

        IFather f = new IFather(new ISon());
        f.findIt();
    }

}
