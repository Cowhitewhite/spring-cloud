package springcloud.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import springcloud.service.PaymentService;

import java.util.concurrent.TimeUnit;

/**
 * @Classname PaymentServiceImpl
 * @Description TODO
 * @Date 2020/6/16 15:36
 * @Created by ChenHao
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Value("${server.port}")
    private String port;

    @Override
    public String getMessage() {
        return "hello payment" + port;
    }

    @Override
    public void timeout() {
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
