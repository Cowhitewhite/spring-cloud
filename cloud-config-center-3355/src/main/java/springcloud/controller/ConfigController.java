package springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname ConfigController
 * @Description TODO
 * @Date 2020/6/18 16:38
 * @Created by ChenHao
 */
@RestController
public class ConfigController {

    @Value("${server.port}")
    private String configInfo;

    @GetMapping("/configInfo")
    public String getConfigInfo(){
        return configInfo;
    }
}
