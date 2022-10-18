package com.hieuduy.baitapjavaweb.service;

import com.hieuduy.baitapjavaweb.model.User;

public interface LoginService {
    User checkLogin(String username, String password);
}
