package com.hieuduy.baitapjavaweb.service.impl;

import com.hieuduy.baitapjavaweb.controller.RegisterController;
import com.hieuduy.baitapjavaweb.dao.RegisterDao;
import com.hieuduy.baitapjavaweb.dao.impl.RegisterDaoImpl;
import com.hieuduy.baitapjavaweb.model.User;
import com.hieuduy.baitapjavaweb.service.RegisterService;

public class RegisterServiceImpl implements RegisterService {
    RegisterDao registerDao = new RegisterDaoImpl();
    @Override
    public boolean RegisterUser(User user) {
        return registerDao.RegisterUser(user);
    }
}
