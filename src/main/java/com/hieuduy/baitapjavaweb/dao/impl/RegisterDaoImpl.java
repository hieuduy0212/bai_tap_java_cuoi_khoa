package com.hieuduy.baitapjavaweb.dao.impl;

import com.hieuduy.baitapjavaweb.dao.RegisterDao;
import com.hieuduy.baitapjavaweb.jdbc.connectDB;
import com.hieuduy.baitapjavaweb.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class RegisterDaoImpl extends connectDB implements RegisterDao {
    Connection conn = null;
    PreparedStatement ps = null;
    Statement stm = null;
    ResultSet rs = null;

    @Override
    public boolean RegisterUser(User user) {
        String queryCheck = "select * from user where username = '" + user.getUsername() + "'";
        String query = "insert into user (username, password, fullname, email, is_admin) values(?,?,?,?,0)";
        try {
            conn = getConnect();
            stm = conn.createStatement();
            rs = stm.executeQuery(queryCheck);
            if (rs.next()) { // da ton tai username
                System.out.println("them that bai");
                return false;
            } else {
                ps = conn.prepareStatement(query);
                ps.setString(1, user.getUsername());
                ps.setString(2, user.getPassword());
                ps.setString(3, user.getFullname());
                ps.setString(4, user.getEmail());
                ps.executeUpdate();
                System.out.println("them thanh cong");
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("them that bai");
        return false;
    }
}
