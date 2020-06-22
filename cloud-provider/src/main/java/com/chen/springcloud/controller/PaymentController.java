package com.chen.springcloud.controller;

import com.chen.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @Classname PaymentController
 * @Description TODO
 * @Date 2020/6/5 16:23
 * @Created by ChenHao
 */
@RestController
public class PaymentController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private PaymentService paymentService;

    @GetMapping("/payment")
    public String hello(){
        return paymentService.getMessage();
    }

    @GetMapping("/payment/dis")
    public Object discovery(){
        discoveryClient.getServices().forEach(System.out::println);
        System.out.println("*****************");
        discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE").forEach(o->{
            System.out.println(o.getInstanceId()+"\t"+o.getHost()+"\t"+o.getPort()+"\t"+o.getUri());
        });
        return discoveryClient;
    }

    @GetMapping("/payment/timeout")
    public String feignTimeout(){
        try {
            paymentService.timeout();
        }catch (Exception e){
            e.printStackTrace();
        }

        return "8001";
    }

    @GetMapping("/payment/get")
    public String test(){

        return "8001";
    }
}
