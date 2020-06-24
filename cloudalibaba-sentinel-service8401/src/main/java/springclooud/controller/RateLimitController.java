package springclooud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import springclooud.handler.MyHandler;

/**
 * @Classname RateLimitController
 * @Description TODO
 * @Date 2020/6/24 11:15
 * @Created by ChenHao
 */
@RestController
public class RateLimitController {

    @GetMapping("/byResource")
    @SentinelResource(value = "byResource",blockHandler = "handlerEx")
    public String testHotkey(){
        return "ok!!!";
    }

    public static String handlerEx(BlockException e){
        return "global Exception!!!";
    }

    public String deal(BlockException e){
        return "no ok!!!" + e.getClass().getCanonicalName();
    }

    @GetMapping("/byUrl")
    @SentinelResource(value = "byUrl")
    public String byUrl(){
        return "ok!!!";
    }


    @GetMapping("/boring")
    @SentinelResource(value = "boring",
            blockHandlerClass = MyHandler.class,
            blockHandler = "handlerEx2")
    public String boring(){
        return "ok!!!";
    }
}
