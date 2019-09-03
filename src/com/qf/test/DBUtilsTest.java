package com.qf.test;



import com.qf.utils.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author lyh666
 * @Date 2019/9/3 16:27
 */
public class DBUtilsTest {
    public static void main(String[] args) throws SQLException {
        Connection conn= DBUtils.getConnection();
        PreparedStatement ps=conn.prepareStatement("insert  into user(username,password) values ('ls','123')");
        ps.executeUpdate();
        ps.close();
        conn.close();
    }
}
