package springcloud.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;
import springcloud.service.ReceiveMessageService;

/**
 * @Classname MessageServiceImpl
 * @Description TODO
 * @Date 2020/6/22 13:40
 * @Created by ChenHao
 */
@Component
@EnableBinding(Sink.class)//定义消息的推送管道
public class ReceiveMessageServiceImpl implements ReceiveMessageService {

    @Value("${server.port}")
    private String port;

    @Override
    @StreamListener(Sink.INPUT)
    public void receive(Message<String> message) {
        System.out.println("消费者2：=====>" + message.getPayload()+ "  "+ port);
    }
}
