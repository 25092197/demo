package com.example.demo.redisTest.service.impl;

import com.example.demo.redisTest.dao.UserDao;
import com.example.demo.redisTest.entity.Users;
import com.example.demo.redisTest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao dao;

    @Override
    @Cacheable(value="user-key")
    public Users getUserByName(String name) {
        return dao.findByName(name);
    }

    @Override
    public void insert(Users u) {
        dao.save(u);
    }
}
