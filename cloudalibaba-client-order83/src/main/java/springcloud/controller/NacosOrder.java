package springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import springcloud.service.PaymentService;

import javax.annotation.Resource;

/**
 * @Classname NacosOrder
 * @Description TODO
 * @Date 2020/6/22 17:22
 * @Created by ChenHao
 */
@RestController
public class NacosOrder {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    PaymentService paymentService;

    @Value("${service-url.nacos-user-service}")
    private String url;

    @GetMapping("/order/consumer")
    public String get(){
        return restTemplate.getForObject(url + "/payment",String.class);
    }

    @GetMapping("/order/{id}")
//    @SentinelResource(value = "fallback",fallback = "handlerFallback")//fallback值负责业务异常
//    @SentinelResource(value = "fallback",blockHandler = "blockHandler")//blockHandler只负责sentinel控制台配置违规
    @SentinelResource(value = "fallback",
            fallback = "handlerFallback",
            blockHandler = "blockHandler",
            exceptionsToIgnore = {IllegalArgumentException.class})//两者配置都生效,添加exceptionsToIgnore会忽略某种异常
    public String get2(@PathVariable("id") Integer id){
        String result = restTemplate.getForObject(url + "/get/"+id,String.class);
        if (id == 4){
            throw new IllegalArgumentException("非法参数");
        }else if(result == null){
            throw new NullPointerException("该ID没有记录");
        }
        return result;
    }

    public String handlerFallback(Integer id,Throwable t){
        return "兜底方法！！！" + t.getMessage();
    }

    public String blockHandler(Integer id, BlockException t){
        return "blockHandler-sentinel限流" + t.getMessage();
    }

    @GetMapping("/order/get/{id}")
    public String get1(@PathVariable("id") Integer id){
        return paymentService.get(id);
    }
}
