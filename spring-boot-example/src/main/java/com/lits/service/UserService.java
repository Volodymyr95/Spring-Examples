package com.lits.service;

import com.lits.model.User;

import java.util.List;

public interface UserService {

    void addUser(User user);

    void delete(Long userId);

    void update(User user);

    List<User> getAll();
}
