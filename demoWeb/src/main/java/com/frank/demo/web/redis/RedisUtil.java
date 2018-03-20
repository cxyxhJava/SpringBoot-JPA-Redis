package com.frank.demo.web.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class RedisUtil {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    public void set(String key,String value){
        stringRedisTemplate.opsForValue().set(key,value);
    }

    public String get(String key){
        return  stringRedisTemplate.opsForValue().get(key);
    }
    /**
     * 递减操作
     * @param key
     * @param by
     * @return
     */
    public  double decr(String key, double by){
        return stringRedisTemplate.opsForValue().increment(key, -by);
    }
    /**
     * 递增操作
     * @param key
     * @param by
     * @return
     */
    public  double incr(String key, double by){
        return stringRedisTemplate.opsForValue().increment(key, by);
    }

}
