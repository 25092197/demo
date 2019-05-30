package com.example.demo.redisTest.dao;

import com.example.demo.redisTest.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<Users,Long> {

    public Users findByName(String name);

}
