package springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Classname GatewayApp
 * @Description TODO
 * @Date 2020/6/18 10:28
 * @Created by ChenHao
 */
@SpringBootApplication
@EnableEurekaClient
public class GatewayApp {
    public static void main(String[] args) {
        SpringApplication.run(GatewayApp.class,args);
    }
}
