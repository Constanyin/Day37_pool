package com.qf.test;

import com.qf.utils.C3P0Utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author lyh666
 * @Date 2019/9/3 19:19
 */
public class C3P0Test {
    public static void main(String[] args) {

        try {
            Connection conn= C3P0Utils.getConnection();
            PreparedStatement ps=conn.prepareStatement("UPDATE user set username='NMD',password='123' where id=3");
            ps.executeUpdate();
            ps.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {

        }
    }
}
