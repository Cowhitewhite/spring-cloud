package com.chen.springcloud.mq.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @Classname config
 * @Description TODO
 * @Date 2020/6/9 8:57
 * @Created by ChenHao
 */
@Configuration
public class MqConfig {

    @Bean
    public Queue queue(){
        return new Queue("q_hello");
    }
}
