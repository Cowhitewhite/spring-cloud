package springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Classname NacosApp
 * @Description TODO
 * @Date 2020/6/22 16:30
 * @Created by ChenHao
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosApp {
    public static void main(String[] args) {
        SpringApplication.run(NacosApp.class,args);
    }
}
