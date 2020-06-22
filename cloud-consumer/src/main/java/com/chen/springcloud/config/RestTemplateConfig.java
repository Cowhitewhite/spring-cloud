package com.chen.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Classname RestTemplateConfig
 * @Description TODO
 * @Date 2020/6/5 16:27
 * @Created by ChenHao
 */
@Configuration
public class RestTemplateConfig {

    @Bean
    @LoadBalanced //负载均衡
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
