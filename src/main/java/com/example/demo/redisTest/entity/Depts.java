package com.example.demo.redisTest.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="depts")
public class Depts implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String code;

    @Column(nullable = false)
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Depts(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public Depts() {
    }
}
