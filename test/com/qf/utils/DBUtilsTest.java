package com.qf.utils;

import org.junit.Test;
import sun.security.pkcs11.Secmod;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author lyh666
 * @Date 2019/9/3 17:38
 */
public class DBUtilsTest {
    @Test
    public void testGetConnection() throws SQLException {
    Connection conn=null;
    PreparedStatement ps=null;
    try{
        conn=DBUtils.getConnection();
        ps=conn.prepareStatement("insert  into  user (username,password) values ('ls','123')");
        ps.executeUpdate();
    } catch (SQLException e) {
        e.printStackTrace();
    }finally {

    }
    }
}
