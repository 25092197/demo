package com.example.demo.mybatisTest.dao;

import com.example.demo.mybatisTest.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserDao extends JpaRepository<Users,Long> {

    public Users findByName(String name);

}
