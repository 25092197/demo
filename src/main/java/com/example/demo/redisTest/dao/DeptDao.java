package com.example.demo.redisTest.dao;

import com.example.demo.redisTest.entity.Depts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeptDao  extends JpaRepository<Depts,Long> {

    public Depts findByName(String name);
}
