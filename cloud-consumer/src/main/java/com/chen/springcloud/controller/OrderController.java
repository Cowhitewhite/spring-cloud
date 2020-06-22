package com.chen.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/order")
    public String hello(){

        return "hello order!!!";
    }

    @GetMapping("/order/rest")
    public Object create(){
       ResponseEntity<String> response = restTemplate.getForEntity("http://CLOUD-PAYMENT-SERVICE/payment",String.class);
       if (response.getStatusCode().is2xxSuccessful()){
           return response.getBody();
       }
        return "444";
    }
}
