package springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Classname NacosOrder
 * @Description TODO
 * @Date 2020/6/22 17:22
 * @Created by ChenHao
 */
@RestController
public class NacosOrder {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${service-url.nacos-user-service}")
    private String url;

    @GetMapping("/order/consumer")
    public String get(){
        return restTemplate.getForObject(url + "/payment",String.class);
    }
}
