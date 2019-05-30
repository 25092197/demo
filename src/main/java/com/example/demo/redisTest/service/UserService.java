package com.example.demo.redisTest.service;

import com.example.demo.redisTest.entity.Users;


public interface UserService {
    public Users getUserByName(String name);
    public void insert(Users u);
}
