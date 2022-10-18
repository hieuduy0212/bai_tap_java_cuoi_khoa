package com.hieuduy.baitapjavaweb.dao.impl;

import com.hieuduy.baitapjavaweb.dao.StaffDao;
import com.hieuduy.baitapjavaweb.jdbc.connectDB;
import com.hieuduy.baitapjavaweb.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StaffDaoImpl extends connectDB implements StaffDao {
    Connection conn = null;
    @Override
    public List<User> getAll() {
        List<User> listUser = new ArrayList<>();
        String query = "select * from user where id > 1";
        try {
            conn = getConnect();
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                int id = rs.getInt("id");
                String fullname = rs.getString("fullname");
                String email = rs.getString("email");
                String username = rs.getString("username");
                String password = rs.getString("password");
                listUser.add(new User(id, username, password, fullname, email, 0));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        if(!listUser.isEmpty()) return listUser;
        else return null;
    }

    @Override
    public User searchById(int idx) {
        User user = null;

        String query = "select * from user where id = "+idx;
        try {
            conn = getConnect();
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            if(rs.next()){
                int id = rs.getInt("id");
                String fullname = rs.getString("fullname");
                String email = rs.getString("email");
                String username = rs.getString("username");
                String password = rs.getString("password");
                user = new User(id, username, password, fullname, email, 0);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public List<User> searchByNameOrUsernameOrEmail(String name) {
        List<User> listUser = new ArrayList<>();
        String query = "select * from user where id > 1 and (fullname like '%"+name+"%' or username like '%"+name+"%' or email like '%\"+name+\"%')";
        try {
            conn = getConnect();
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                int id = rs.getInt("id");
                String fullname = rs.getString("fullname");
                String email = rs.getString("email");
                String username = rs.getString("username");
                String password = rs.getString("password");
                listUser.add(new User(id, username, password, fullname, email, 0));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        if(!listUser.isEmpty()) return listUser;
        else return null;
    }

    @Override
    public void update(User user) {
        String query = "update user set fullname = ?, email=?, password=? where id = ?";
        PreparedStatement ps = null;
        try{
            conn = getConnect();
            ps = conn.prepareStatement(query);
            ps.setString(1, user.getFullname());
            ps.setString(2, user.getEmail());
            ps.setString(3, user.getPassword());
            ps.setInt(4, user.getId());
            int ok = ps.executeUpdate();
            if (ok>0){
                System.out.println("Update successfully");
            }else{
                System.out.println("update failure");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int idx) {
        String query = "delete from user where id = " + idx;
        try{
            conn = getConnect();
            Statement stm = conn.createStatement();
            stm.executeUpdate(query);
            System.out.println("xoa thanh cong");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
