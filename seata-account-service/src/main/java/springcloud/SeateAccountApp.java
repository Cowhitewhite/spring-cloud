package springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Classname SeateAccountApp
 * @Description TODO
 * @Date 2020/6/29 15:01
 * @Created by ChenHao
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableFeignClients
@EnableDiscoveryClient
public class SeateAccountApp {
    public static void main(String[] args) {
        SpringApplication.run(SeateAccountApp.class,args);
    }
}
