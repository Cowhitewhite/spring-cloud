package com.chen.springcloud.mq.receive;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Classname HelloReceiver
 * @Description TODO
 * @Date 2020/6/9 9:03
 * @Created by ChenHao
 */
@Component
@RabbitListener(queues = "q_hello")
public class HelloReceiver {

    @RabbitHandler
    public void process(String hello){
        System.out.println("receiver:"+hello);
    }
}
