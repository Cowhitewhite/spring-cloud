package springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Classname NacosClient
 * @Description TODO
 * @Date 2020/6/22 17:08
 * @Created by ChenHao
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class NacosClient {
    public static void main(String[] args) {
        SpringApplication.run(NacosClient.class,args);
    }
}
