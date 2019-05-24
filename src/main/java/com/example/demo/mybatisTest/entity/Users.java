package com.example.demo.mybatisTest.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name="zwb_users")
public class Users implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String sex;
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date birthday;
}
