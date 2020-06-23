package springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Classname ConfigApp3
 * @Description TODO
 * @Date 2020/6/22 10:20
 * @Created by ChenHao
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigApp3 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigApp3.class,args);
    }
}
