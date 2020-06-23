package springcloud.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import springcloud.service.MessageService;

import java.util.UUID;

/**
 * @Classname MessageServiceImpl
 * @Description TODO
 * @Date 2020/6/22 13:40
 * @Created by ChenHao
 */
@EnableBinding(Source.class)//定义消息的推送管道
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageChannel output;//发送消息的管道

    @Override
    public String send() {
        String str = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(str).build());
        System.out.println("***************" + str);
        return str;
    }
}
