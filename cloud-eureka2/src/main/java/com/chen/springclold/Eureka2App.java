package com.chen.springclold;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Classname com.chen.springclold.Eureka2App
 * @Description TODO
 * @Date 2020/6/15 16:35
 * @Created by ChenHao
 */
@SpringBootApplication
@EnableEurekaServer
public class Eureka2App {
    public static void main(String[] args) {
        SpringApplication.run(Eureka2App.class, args);
    }
}
