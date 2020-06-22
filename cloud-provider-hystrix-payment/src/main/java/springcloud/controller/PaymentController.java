package springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import springcloud.service.PaymentService;

/**
 * @Classname PaymentController
 * @Description TODO
 * @Date 2020/6/5 16:23
 * @Created by ChenHao
 */
@RestController
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping("/payment/ok")
    public String hello(){
        System.out.println("=====================ok=====================");
        return paymentService.getMessage();
    }

    @GetMapping("/payment/timeout")
    public String feignTimeout(){
        System.out.println("=====================timeout=====================");
        return paymentService.error();
    }

    @GetMapping("/payment/circuit/{id}")
    public String circuit(@PathVariable("id") Integer id){
        System.out.println("=====================circuit=====================");
        return paymentService.paymentCircuitBreaker(id);
    }
}
