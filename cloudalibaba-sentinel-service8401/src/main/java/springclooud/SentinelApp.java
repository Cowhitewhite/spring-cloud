package springclooud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Classname SentinelApp
 * @Description TODO
 * @Date 2020/6/24 9:14
 * @Created by ChenHao
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SentinelApp {
    public static void main(String[] args) {
        SpringApplication.run(SentinelApp.class,args);
    }
}
