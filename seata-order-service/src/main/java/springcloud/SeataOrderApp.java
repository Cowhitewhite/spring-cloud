package springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Classname SeataOrderApp
 * @Description TODO
 * @Date 2020/6/24 16:54
 * @Created by ChenHao
 */
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class SeataOrderApp {
    public static void main(String[] args) {
        SpringApplication.run(SeataOrderApp.class,args);
    }
}
