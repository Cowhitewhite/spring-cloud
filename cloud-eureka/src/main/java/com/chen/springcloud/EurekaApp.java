package com.chen.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Classname EurekaApp
 * @Description TODO
 * @Date 2020/6/5 17:20
 * @Created by ChenHao
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApp {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApp.class, args);
    }
}

