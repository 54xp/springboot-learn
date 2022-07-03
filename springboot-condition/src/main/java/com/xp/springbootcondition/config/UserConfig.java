package com.xp.springbootcondition.config;

import com.xp.springbootcondition.condition.ClassCondition;
import com.xp.springbootcondition.domain.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author pxiong
 * @create 2022-07-03 13:17
 */
@Configuration
public class UserConfig {

    @Bean
    @Conditional(ClassCondition.class)
    public User getUser(){
        return new User();
    }
}
