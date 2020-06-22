package chen.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Classname PaymentFeignService
 * @Description TODO
 * @Date 2020/6/16 15:33
 * @Created by ChenHao
 */
@Service
@FeignClient("CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {

   @GetMapping("/payment")
   ResponseEntity<String> hello();

   @GetMapping("/payment/timeout")
   String feignTimeout();
}
