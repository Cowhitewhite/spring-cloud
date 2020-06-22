package springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Classname ConfigApp
 * @Description TODO
 * @Date 2020/6/18 13:53
 * @Created by ChenHao
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigApp {
    public static void main(String[] args) {
        SpringApplication.run(ConfigApp.class,args);
    }
}
