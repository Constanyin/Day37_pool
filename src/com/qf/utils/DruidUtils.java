package com.qf.utils;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author lyh666
 * @Date 2019/9/3 19:31
 */
public class DruidUtils {
    private  static DataSource dataSource;
    static {
        Properties properties =new Properties();

            try {
                properties.load(DruidUtils.class.getClassLoader().getResourceAsStream("druid.properties"));
                dataSource = DruidDataSourceFactory.createDataSource(properties);
            } catch (IOException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }

    }
    public static Connection getConnection(){
        Connection conn=null;
        try{
            conn=dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }return conn;
    }
}
