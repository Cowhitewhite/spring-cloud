package springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import springcloud.service.impl.PaymentFeignServiceImpl;

/**
 * @Classname PaymentFeignService
 * @Description TODO
 * @Date 2020/6/16 15:33
 * @Created by ChenHao
 */
@Service
@FeignClient(value = "CLOUD-PAYMENT-HYSTRIX-SERVICE",fallback = PaymentFeignServiceImpl.class)
public interface PaymentFeignService {

   @GetMapping("/payment/ok")
   ResponseEntity<String> hello();

   @GetMapping("/payment/timeout")
   String feignTimeout();
}
