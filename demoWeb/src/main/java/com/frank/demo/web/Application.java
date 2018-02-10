package com.frank.demo.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

/**
 * Created by yangxb on 2018/2/10.
 */
@Service
@EnableCaching//开启缓存扫描
@ComponentScan //conponent扫描
@Configuration //设置为配置文件

@EnableAutoConfiguration //开启配置文件自动注入
//@ImportResource("classpath:spring-context.xml") //导入配置文件
//@EnableRabbit  开启rabbit
//@EnableJpaAuditing 开启jpa
public class Application extends SpringBootServletInitializer {

    public final static Logger LOGGER = LoggerFactory.getLogger(Application.class);


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Application.class);
    }

}
