package com.example.demo.mybatisTest.dao;

import com.example.demo.mybatisTest.entity.Depts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeptDao  extends JpaRepository<Depts,Long> {

    public Depts findByName(String name);
}
