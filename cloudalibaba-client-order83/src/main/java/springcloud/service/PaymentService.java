package springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import springcloud.fallback.PaymentFallbackService;

/**
 * @Classname PaymentService
 * @Description TODO
 * @Date 2020/6/24 14:12
 * @Created by ChenHao
 */
@Service
@FeignClient(value = "nacos-payment-service",fallback = PaymentFallbackService.class)
public interface PaymentService {

    @GetMapping("/get/{id}")
    public String get(@PathVariable("id")Integer id);
}
