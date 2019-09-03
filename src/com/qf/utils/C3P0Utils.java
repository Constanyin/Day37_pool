package com.qf.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.CommonDataSource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author lyh666
 * @Date 2019/9/3 19:08
 */
public class C3P0Utils {
    private static DataSource dataSource;
    static{
        dataSource=new ComboPooledDataSource();
    }
    public static Connection getConnection(){
        Connection conn=null;
        try {
                conn=dataSource.getConnection();
            } catch (SQLException e) {
                e.printStackTrace();
        }
        return conn;
   }
}
