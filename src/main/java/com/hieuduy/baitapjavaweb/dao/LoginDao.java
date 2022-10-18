package com.hieuduy.baitapjavaweb.dao;

import com.hieuduy.baitapjavaweb.model.User;

public interface LoginDao {
    User checkLogin(String username, String password);
}
