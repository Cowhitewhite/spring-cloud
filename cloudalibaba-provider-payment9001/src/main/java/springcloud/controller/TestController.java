package springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname TestController
 * @Description TODO
 * @Date 2020/6/22 16:35
 * @Created by ChenHao
 */
@RestController
public class TestController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/payment")
    public String get(){
        return "nacos ok!!!  "+port;
    }
}
