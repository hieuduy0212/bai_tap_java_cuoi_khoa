package com.hieuduy.baitapjavaweb.dao;

import com.hieuduy.baitapjavaweb.model.User;

import java.util.List;

public interface StaffDao {
    List<User> getAll();
    User searchById(int idx);
    List<User> searchByNameOrUsernameOrEmail(String name);

    void update(User user);

    void delete(int idx);
}
