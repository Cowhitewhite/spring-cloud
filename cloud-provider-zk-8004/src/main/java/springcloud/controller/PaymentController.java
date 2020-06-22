package springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname PaymentController
 * @Description TODO
 * @Date 2020/6/5 16:23
 * @Created by ChenHao
 */
@RestController
public class PaymentController {

    @Value("${server.port}")
    private String port;

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/payment/zk")
    public String hello(){
        return "hello payment ZK!!!"+ port;
    }

    @GetMapping("/payment/dis")
    public Object discovery(){
        discoveryClient.getServices().forEach(System.out::println);
        System.out.println("*****************");
        discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE").forEach(o->{
            System.out.println(o.getInstanceId()+"\t"+o.getHost()+"\t"+o.getPort()+"\t"+o.getUri());
        });
        return discoveryClient;
    }
}
