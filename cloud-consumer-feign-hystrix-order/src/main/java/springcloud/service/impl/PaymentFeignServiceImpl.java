package springcloud.service.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import springcloud.service.PaymentFeignService;

/**
 * @Classname PaymentFeignServiceImpl
 * @Description TODO
 * @Date 2020/6/17 13:49
 * @Created by ChenHao
 */
@Service
public class PaymentFeignServiceImpl implements PaymentFeignService {

    @Override
    public ResponseEntity<String> hello() {

        return ResponseEntity.ok("o(╥﹏╥)oo(╥﹏╥)o————payment_ok");
    }

    @Override
    public String feignTimeout() {
        return "payment_timeout_o(╥﹏╥)o";
    }
}
