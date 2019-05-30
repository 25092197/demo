package com.example.demo.redisTest.dao;

import com.example.demo.redisTest.entity.Roles;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDao extends JpaRepository<Roles,Long> {

}
