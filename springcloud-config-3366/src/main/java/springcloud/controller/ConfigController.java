package springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname ConfigController
 * @Description TODO
 * @Date 2020/6/18 16:38
 * @Created by ChenHao
 */
@RestController
@RefreshScope
public class ConfigController {

    @Value("${chen}")
    private String configInfo;

    @Value("${server.port}")
    private String port;


    @GetMapping("/configInfo")
    public String getConfigInfo(){
        return configInfo + "      " + port;
    }
}
