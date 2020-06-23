package springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Classname RestTemplateConfig
 * @Description TODO
 * @Date 2020/6/23 8:39
 * @Created by ChenHao
 */
@Configuration
public class RestTemplateConfig {

    @Bean
    @LoadBalanced
    public RestTemplate getBean(){
        return new RestTemplate();
    }
}
