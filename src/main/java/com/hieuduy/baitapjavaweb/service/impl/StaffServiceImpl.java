package com.hieuduy.baitapjavaweb.service.impl;

import com.hieuduy.baitapjavaweb.dao.StaffDao;
import com.hieuduy.baitapjavaweb.dao.impl.StaffDaoImpl;
import com.hieuduy.baitapjavaweb.model.User;
import com.hieuduy.baitapjavaweb.service.StaffService;

import java.util.List;

public class StaffServiceImpl implements StaffService {
    StaffDao staffDao = new StaffDaoImpl();
    @Override
    public List<User> getAll() {
        return staffDao.getAll();
    }

    @Override
    public User searchById(int idx) {
        return staffDao.searchById(idx);
    }

    @Override
    public List<User> searchByNameOrUsernameOrEmail(String name) {
        return staffDao.searchByNameOrUsernameOrEmail(name);
    }

    @Override
    public void update(User user) {
        staffDao.update(user);
    }

    @Override
    public void delete(int idx) {
        staffDao.delete(idx);
    }
}
