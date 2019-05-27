package com.example.demo.mybatisTest.controller;


import com.example.demo.common.util.RedisUtil;
import com.example.demo.mybatisTest.entity.Users;
import com.example.demo.mybatisTest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    RedisUtil redisUtil;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @RequestMapping("hello")
    @ResponseBody
    public String hello(){
        return "hello word";
    }

    @RequestMapping("getUser")
    @ResponseBody
    public Users getUser(String name){
        Object user = userService.getUserByName(name);

        return (Users) user;
    }
    @RequestMapping("setRedis")
    @ResponseBody
    public void setRedis(){
        redisUtil.setValue("1","1");
//        stringRedisTemplate.opsForValue().set("key", "hello");
    }
    @RequestMapping("getRedis")
    @ResponseBody
    public String getRedis(){
        return redisUtil.getValue("1").toString();
//        return stringRedisTemplate.opsForValue().get("key");
    }
}
