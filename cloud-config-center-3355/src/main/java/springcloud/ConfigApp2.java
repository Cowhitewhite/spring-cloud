package springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Classname ConfigApp2
 * @Description TODO
 * @Date 2020/6/18 14:42
 * @Created by ChenHao
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigApp2 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigApp2.class,args);
    }
}
