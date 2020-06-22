package springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Classname PaymentController
 * @Description TODO
 * @Date 2020/6/5 16:23
 * @Created by ChenHao
 */
@RestController
public class OrderController {


    @Value("${server.port}")
    private String port;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/order")
    public String hello(){

        return "hello order!!!" + port;
    }

    @GetMapping("/order/rest")
    public ResponseEntity<String> create(){
       return restTemplate.getForEntity("http://cloud-payment-service/payment/zk",String.class);
    }
}
