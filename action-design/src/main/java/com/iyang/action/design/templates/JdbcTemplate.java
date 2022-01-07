package com.iyang.action.design.templates;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/*****
 *  * ( •_•)                          (•_• )
 *    ( ง )ง                          ୧( ୧ )
 *    /︶\                              /︶\
 * @author : LuoHong
 * @date: 2022/1/6
 * @ProjectName: factory-design
 * @desc:
 **/
public abstract class JdbcTemplate {

    private DataSource dataSource;

    public JdbcTemplate(DataSource dataSource){
        this.dataSource = dataSource;
    }


    public List<?> executeQuery(String sql,RowMapper<?> rowMapper , Object [] values){


        return null;
    }


    protected void closeConnection(Connection conn) throws Exception {
        // 数据库连接池,
        if(conn != null){
            conn.close();
        }

    }


    protected void closeStatement(PreparedStatement pstm) throws Exception {
        pstm.close();
    }


    protected void closeResultSet(ResultSet rs) throws Exception {
        rs.close();
    }


    protected List<?> paresResultSet(ResultSet rs , RowMapper<?> rowMapper) throws Exception {

        List<Object> result = new ArrayList<>();
        int rowNum = 1;
        while (rs.next()){
            result.add(rowMapper.mapRow(rs,rowNum+1));
        }
        return result;
    }


    protected ResultSet executeQuery(PreparedStatement pstm , Object [] values) throws Exception {

        for(int i = 0 , j  = values.length ; i < j ; i ++){
            pstm.setObject(i,values[i]);
        }

        return pstm.executeQuery();
    }

    protected PreparedStatement createPreparedStatement(Connection conn , String sql) throws Exception  {

        return conn.prepareStatement(sql);

    }

    public Connection getConnection()throws Exception  {

        return this.dataSource.getConnection();
    }

}
