package springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springcloud.service.MessageService;

/**
 * @Classname MessageController
 * @Description TODO
 * @Date 2020/6/22 13:48
 * @Created by ChenHao
 */
@RestController
public class MessageController {

    @Autowired
    private MessageService messageService;

    @GetMapping("/send")
    public String sendMessage(){
        return messageService.send();
    }
}
