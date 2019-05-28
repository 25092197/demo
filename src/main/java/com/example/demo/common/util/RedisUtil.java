package com.example.demo.common.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;

@Component
public class RedisUtil{

    @Value("${spring.redis.host}")
    private  String host;

    public  Jedis getJedis(){
        Jedis jedis = new Jedis(host);
        return jedis;
    }
}