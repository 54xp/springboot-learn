package com.xp.springbootcondition;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootConditionApplication {

    public static void main(String[] args) {
        // 启动springboot应用，获取IOC容器
        ConfigurableApplicationContext context = SpringApplication.run(SpringbootConditionApplication.class, args);
        // 获取bean，redisTemplate
     /*   Object redisTemplate = context.getBean("redisTemplate");
        System.out.println("redisTemplate = " + redisTemplate);*/

        Object user = context.getBean("getUser");
        System.out.println("user = " + user);
    }

}
