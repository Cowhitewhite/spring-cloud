package springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @Classname TestController
 * @Description TODO
 * @Date 2020/6/22 16:35
 * @Created by ChenHao
 */
@RestController
public class TestController {

    public static HashMap<Integer,String> result = new HashMap<>();
    static {
        result.put(1,"a");
        result.put(2,"b");
        result.put(3,"c");
    }

    @Value("${server.port}")
    private String port;

    @GetMapping("/payment")
    public String get(){
        return "nacos ok!!!  "+port;
    }

    @GetMapping("/get/{id}")
    public String get(@PathVariable("id")Integer id){
        return result.get(id) + port;
    }
}
