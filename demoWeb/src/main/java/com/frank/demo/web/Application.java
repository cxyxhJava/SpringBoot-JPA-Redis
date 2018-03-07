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


    /**
     * db配置
     * @return
     */
   /* @Bean
    @Primary
    @ConfigurationProperties(prefix="datasource.primary")
    public DataSource dataSource() {
        DataSource ds = new DataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl(config.getDataSourceUrl());
        ds.setUsername(config.getDataSourceUserName());
        ds.setPassword(config.getDataSourcePassword());

        ds.setTestWhileIdle(true);
        ds.setTestOnBorrow(true);
        ds.setTestOnReturn(true);
        ds.setValidationQuery("SELECT 1");

        return ds;
    }

       @Bean
    public HibernateJpaSessionFactoryBean sessionFactory() {

        return new HibernateJpaSessionFactoryBean()

                ;
    }
*/

    /**
     * redis 配置
     */

 /*   @Bean
    public RedisUtils getRedisUtils(){
        RedisUtils redisUtils = new RedisUtils(RedisCache.LEGWORK, "legwrork", getRedisTemplate(), 86400);

        return redisUtils;
    }

    @Bean
    @SuppressWarnings("rawtypes")
    public RedisSerializer fastJson2JsonRedisSerializer() {
        return new FastJson2JsonRedisSerializer<Object>(Object.class);
    }

    @Bean
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public Jackson2JsonRedisSerializer jackson2JsonRedisSerializer() {
        Jackson2JsonRedisSerializer<Object> jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer(Object.class);
        ObjectMapper om = new ObjectMapper();
        om.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
        om.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
        jackson2JsonRedisSerializer.setObjectMapper(om);
        return jackson2JsonRedisSerializer;
    }

    @Bean
    public RedisTemplate<?, ?> getRedisTemplate(){
        RedisTemplate<?,?> template = new StringRedisTemplate(redisConnectionFactory());
        template.setValueSerializer(jackson2JsonRedisSerializer());
        template.afterPropertiesSet();

        return template;
    }

    @Bean
    public RedisConnectionFactory redisConnectionFactory() {
        JedisConnectionFactory factory = new JedisConnectionFactory();

        factory.setHostName(config.getRedisHost());
        factory.setPort(config.getRedisPort());
        factory.setPassword(config.getRedisPassword());
        factory.setDatabase(config.getRedisDbIndex());
        factory.setUsePool(true);

        factory.afterPropertiesSet();

        return factory;
    }*/

}
