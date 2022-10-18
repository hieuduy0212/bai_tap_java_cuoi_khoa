package com.hieuduy.baitapjavaweb.dao.impl;

import com.hieuduy.baitapjavaweb.dao.LoginDao;
import com.hieuduy.baitapjavaweb.jdbc.connectDB;
import com.hieuduy.baitapjavaweb.model.User;
import com.mysql.cj.PreparedQuery;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDaoImpl extends connectDB implements LoginDao {
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement ps = null;

    @Override
    public User checkLogin(String username, String password) {
        String query = "select * from user where username = ? and password = ?";
        try {
            conn = getConnect();
            ps = conn.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, password);
            rs = ps.executeQuery();
            if(rs.next()){
                int id = rs.getInt("id");
                String fullname = rs.getString("fullname");
                String email = rs.getString("email");
                int is_admin = rs.getInt("is_admin");
                return new User(id, username, password, fullname, email, is_admin);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
