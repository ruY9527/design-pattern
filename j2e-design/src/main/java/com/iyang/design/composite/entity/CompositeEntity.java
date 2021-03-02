package com.iyang.design.composite.entity;

/**
 * Created by Yang on 2021/3/2 23:03
 */

public class CompositeEntity {

    private CoarseGrainedObject cgo = new CoarseGrainedObject();

    public void setData(String data1,String data2){
        cgo.setData(data1, data2);
    }

    public String[] getData(){
        return cgo.getData();
    }

}
