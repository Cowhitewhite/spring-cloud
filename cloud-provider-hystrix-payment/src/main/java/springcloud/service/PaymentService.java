package springcloud.service;

/**
 * @Classname PaymentService
 * @Description TODO
 * @Date 2020/6/16 15:35
 * @Created by ChenHao
 */
public interface PaymentService {

    String getMessage();

    String error();

    String paymentCircuitBreaker(int id);
}
