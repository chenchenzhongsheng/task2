package com.jnshu.service.impl;


import com.jnshu.dao.UserMapper;
import com.jnshu.model.User;
import com.jnshu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@SuppressWarnings("all")
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper dao;


    public List<User> list(){

        return dao.list();
    }


    public User get(Integer id){

        return dao.get(id);
    }


    public  int add(User user) {
        return dao.add(user);
    }


    public int delete(Integer id){

        return dao.delete(id);
    }


    public int update(User user) {

        return dao.update(user);
    }



}
