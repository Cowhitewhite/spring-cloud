package springcloud.service;

import org.springframework.messaging.Message;

/**
 * @Classname MessageService
 * @Description TODO
 * @Date 2020/6/22 13:39
 * @Created by ChenHao
 */
public interface ReceiveMessageService {
    void receive(Message<String> message);
}
