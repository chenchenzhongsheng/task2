package com.jnshu.service;

import com.jnshu.model.User;

import java.util.List;

public interface UserService {
    List<User> list();
    User get(Integer id);

    int add(User user);
    int delete(Integer id);
    int update(User user);
}
