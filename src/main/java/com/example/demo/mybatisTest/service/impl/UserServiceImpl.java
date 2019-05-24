package com.example.demo.mybatisTest.service.impl;

import com.example.demo.mybatisTest.dao.UserDao;
import com.example.demo.mybatisTest.entity.Users;
import com.example.demo.mybatisTest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao dao;



    @Override
    public Users getUserByName(String name) {
        return dao.findByName("朱文博");
    }
}
