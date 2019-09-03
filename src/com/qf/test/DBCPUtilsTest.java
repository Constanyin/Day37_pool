package com.qf.test;

import com.qf.utils.DBCPUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author lyh666
 * @Date 2019/9/3 17:51
 */
public class DBCPUtilsTest {
    public static void main(String[] args) throws SQLException {
        Connection conn= DBCPUtils.getconnection();
        PreparedStatement ps=conn.prepareStatement("insert into user (username,password) values ('qz','123')");
        ps.executeUpdate();
        ps.close();
        conn.close();
    }
}
