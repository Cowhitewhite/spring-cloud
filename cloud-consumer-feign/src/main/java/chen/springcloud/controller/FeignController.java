package chen.springcloud.controller;

import chen.springcloud.service.PaymentFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname FeignController
 * @Description TODO
 * @Date 2020/6/16 15:51
 * @Created by ChenHao
 */
@RestController
public class FeignController {

    @Autowired
    private PaymentFeignService paymentFeignService;

    @GetMapping("/order")
    public Object create(){
        return paymentFeignService.hello();
    }

    @GetMapping("/order/timeout")
    public String timeout(){
        return paymentFeignService.feignTimeout();
    }
}
