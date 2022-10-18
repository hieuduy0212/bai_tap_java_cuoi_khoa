package com.hieuduy.baitapjavaweb.service;

import com.hieuduy.baitapjavaweb.model.User;

import java.util.List;

public interface StaffService {
    List<User> getAll();
    User searchById(int idx);
    List<User> searchByNameOrUsernameOrEmail(String name);
    void update(User user);

    void delete(int idx);
}
