package com.hieuduy.baitapjavaweb.jdbc;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class connectDB {
    public static Connection getConnect(){
        Connection conn = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/QLNV", "root", "123Hieu123@");
            System.out.println("Ket noi thanh cong");
        }catch(Exception e){
            e.printStackTrace();
        }
        return conn;
    }
}
