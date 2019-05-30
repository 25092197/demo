package com.example.demo.redisTest.controller;


import com.example.demo.common.util.RedisUtil;
import com.example.demo.redisTest.entity.Users;
import com.example.demo.redisTest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import redis.clients.jedis.Jedis;

@Controller
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    RedisUtil redisUtil;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Value("${spring.redis.host}")
    private  String host;

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

    @RequestMapping("testJedis")
    @ResponseBody
    public void testJedis(){
        Jedis jedis = new Jedis(host);
        jedis.set("a","++++++++++++");

        System.out.println(jedis.get("a"));
    }

}
