package springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Classname StreamApp
 * @Description TODO
 * @Date 2020/6/22 13:37
 * @Created by ChenHao
 */
@SpringBootApplication
@EnableEurekaClient
public class StreamApp3 {
    public static void main(String[] args) {
        SpringApplication.run(StreamApp3.class,args);
    }
}
