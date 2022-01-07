package com.iyang.action.design.templates;

import java.sql.ResultSet;

/*****
 *  * ( •_•)                          (•_• )
 *    ( ง )ง                          ୧( ୧ )
 *    /︶\                              /︶\
 * @author : LuoHong
 * @date: 2022/1/6
 * @ProjectName: factory-design
 * @desc:
 **/
public interface RowMapper<T> {

    T mapRow(ResultSet rs , int rowNum) throws Exception ;

}
