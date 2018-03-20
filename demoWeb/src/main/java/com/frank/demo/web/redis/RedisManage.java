package com.frank.demo.web.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.support.AbstractCacheManager;

import java.util.Collection;

public class RedisManage extends AbstractCacheManager {

    @Autowired
    private  MyRedisCache myRedisCache;

    @Override
    protected Collection<? extends Cache> loadCaches() {

        return (Collection<? extends Cache>) myRedisCache;
    }
}
