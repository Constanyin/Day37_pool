package com.qf.test;

import com.qf.utils.DruidUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author lyh666
 * @Date 2019/9/3 19:44
 */
public class DruidUtilsTest {
    public static void main(String[] args) throws SQLException {
        Connection conn= DruidUtils.getConnection();
        PreparedStatement ps=conn.prepareStatement("update user set username='jsbb',password='123'");
        ps.executeUpdate();
        ps.close();
        conn.close();
    }
}
