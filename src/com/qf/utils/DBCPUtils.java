package com.qf.utils;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.commons.dbcp.BasicDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author lyh666
 * @Date 2019/9/3 16:17
 */
public class DBCPUtils {
    private static DataSource dataSource;
    static{
        Properties properties = new Properties();
        try{
            properties.load(DBCPUtils.class.getClassLoader().getResourceAsStream("dbcp.properties"));
            dataSource= BasicDataSourceFactory.createDataSource(properties);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static Connection getconnection(){
        Connection conn=null;
        try{
            conn=dataSource.getConnection();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
}
