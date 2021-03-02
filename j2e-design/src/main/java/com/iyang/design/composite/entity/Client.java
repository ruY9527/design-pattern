package com.iyang.design.composite.entity;

/**
 * Created by Yang on 2021/3/2 23:04
 */

public class Client {

    private CompositeEntity compositeEntity = new CompositeEntity();

    public void printData(){

        for(int i=0;i < compositeEntity.getData().length;i++){
            System.out.println("Data : " + compositeEntity.getData()[i]);
        }

    }

    /**
     * 赋值data.
     * @param data1
     * @param data2
     */
    public void setData(String data1,String data2){
        compositeEntity.setData(data1, data2);
    }

}
