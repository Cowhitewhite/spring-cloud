package springcloud.fallback;

import org.springframework.stereotype.Component;
import springcloud.service.PaymentService;

/**
 * @Classname PaymentImpl
 * @Description TODO
 * @Date 2020/6/24 14:16
 * @Created by ChenHao
 */
@Component
public class PaymentFallbackService implements PaymentService {

    @Override
    public String get(Integer id) {
        String a = "error";
        return a+id;
    }
}
