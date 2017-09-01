package com.jnshu.dao;

import com.jnshu.model.User;

import java.util.List;

public interface UserMapper {

    List<User> list();
    User get(Integer id);
    int  add(User user);
    int delete(int id);
    int update(User user);

}
