package springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springcloud.service.PaymentFeignService;

/**
 * @Classname FeignController
 * @Description TODO
 * @Date 2020/6/16 15:51
 * @Created by ChenHao
 */
@RestController
@DefaultProperties(defaultFallback = "defaultError")
public class FeignController {

    @Autowired
    private PaymentFeignService paymentFeignService;

    @GetMapping("/order")
    @HystrixCommand
    public Object create(){
        return paymentFeignService.hello();
    }

    @GetMapping("/order/timeout")
//    @HystrixCommand(fallbackMethod = "paymentTimeout")
    @HystrixCommand
    public String timeout(){
        return paymentFeignService.feignTimeout();
    }

    public String paymentTimeout(){
        return "对方服务系统繁忙，请稍后再试！！！";
    }

    public String defaultError(){
        return "服务异常！！！";
    }
}
