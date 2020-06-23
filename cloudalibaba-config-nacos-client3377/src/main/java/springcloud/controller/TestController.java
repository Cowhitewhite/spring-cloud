package springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname TestController
 * @Description TODO
 * @Date 2020/6/23 9:02
 * @Created by ChenHao
 */
@RestController
@RefreshScope
public class TestController {

    @Value("${chen.test}")
    private String configInfo;

    @Value("${server.port}")
    private String port;


    @GetMapping("/config")
    public String getConfigInfo(){
        return configInfo + "      " + port;
    }
}
