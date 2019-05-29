package com.example.demo.mybatisTest.dao;

import com.example.demo.mybatisTest.entity.Roles;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDao extends JpaRepository<Roles,Long> {

}
