package springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Classname NacosConfigApp
 * @Description TODO
 * @Date 2020/6/23 9:01
 * @Created by ChenHao
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosConfigApp {
    public static void main(String[] args) {
        SpringApplication.run(NacosConfigApp.class,args);
    }
}
