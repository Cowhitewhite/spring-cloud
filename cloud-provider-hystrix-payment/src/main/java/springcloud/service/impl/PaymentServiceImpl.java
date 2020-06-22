package springcloud.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import springcloud.service.PaymentService;

import java.util.UUID;
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
        return "线程池：" + Thread.currentThread().getName() + " getMessage()_ok" + " =====>" + port;
    }

    @Override
    @HystrixCommand(fallbackMethod = "error_timeoutHandler",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "3000")//3秒内走正常逻辑，超时走error_timeoutHandler
    })
    public String error() {
        int timeNum = 4;
        try {
            TimeUnit.SECONDS.sleep(timeNum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池：" + Thread.currentThread().getName() + " getMessage()_timeout" + " =====>" + port;
    }

    public String error_timeoutHandler() {
        return "线程池：" + Thread.currentThread().getName() + "系统繁忙，请稍后再试"+port;
    }

    //服务熔断
    @Override
    @HystrixCommand(fallbackMethod = "circuitBreaker_fallback",commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled",value = "true"),//是否开启断路器
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "10"),//请求次数
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "1000"),//时间窗口期
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60")//失败率达到多少跳闸
    })
    public String paymentCircuitBreaker(int id){
        if (id < 0){
            throw new RuntimeException("=====id不能为负数");
        }
        return "线程池：" + Thread.currentThread().getName() + "调用成功:"+id+"  流水号："+ UUID.randomUUID().toString();
    }

    public String circuitBreaker_fallback(int id) {
        return "id不能为负数,请稍后再试" +port+ "   "+ id;
    }
}
