package springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
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

    @GetMapping("/payment")
    public String hello(){
        return paymentService.getMessage();
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
    public String get(){
        return "8002";
    }
}
