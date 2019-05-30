package com.example.demo.mongodbTest;

import com.example.demo.mongodbTest.entity.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MongodbTestDaoTest {
    @Autowired
    private MongoTemplate mongoTemplate ;





    @Test
    public void save(){
        Users u = new Users();
        u.setName("张丽颖");
        u.setSex("女");
        u.setBirthday(new Date());
        mongoTemplate.save(u);
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
    }

}