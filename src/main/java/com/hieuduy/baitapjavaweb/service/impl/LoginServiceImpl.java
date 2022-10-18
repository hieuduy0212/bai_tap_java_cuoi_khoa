package com.hieuduy.baitapjavaweb.service.impl;

import com.hieuduy.baitapjavaweb.dao.LoginDao;
import com.hieuduy.baitapjavaweb.dao.impl.LoginDaoImpl;
import com.hieuduy.baitapjavaweb.model.User;
import com.hieuduy.baitapjavaweb.service.LoginService;

public class LoginServiceImpl implements LoginService {
    LoginDao loginDao = new LoginDaoImpl();

    @Override
    public User checkLogin(String username, String password) {
        return loginDao.checkLogin(username, password);
    }
}
