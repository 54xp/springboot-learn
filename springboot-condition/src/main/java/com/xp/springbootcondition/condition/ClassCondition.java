package com.xp.springbootcondition.condition;


import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;


/**
 * @author pxiong
 * @create 2022-07-03 13:23
 */
public class ClassCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        //导入jedis创建bean
        // 判断是否存在jedis,存在就创建getUser这个bean；不存在就不创建getUser这个bean
        boolean flag = true;
        try {
            Class<?> aClass = Class.forName("redis.clients.jedis.Jedis");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            flag = false;
        }
        return flag;
    }
}
