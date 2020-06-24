package springclooud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @Classname FlowLimitController
 * @Description TODO
 * @Date 2020/6/24 9:16
 * @Created by ChenHao
 */
@RestController
public class FlowLimitController {

    @GetMapping("/test1")
    public String test1(){
        return "AAAAAAA";
    }

    @GetMapping("/test2")
    public String test2(){
        System.out.println(Thread.currentThread().getName()+"test 2");
        return "BBBBBBBB";
    }

    @GetMapping("/test3")
    public String test3(){

        try {
            TimeUnit.SECONDS.sleep(1);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("test3 测试RT");
        return "CCCCCCC";
    }

    @GetMapping("/test4")
    public String test4(){

        System.out.println("test4 异常比例");
        int a = 1/0;
        return "DDDDDD";
    }

    @GetMapping("/test5")
    public String test5(){

        System.out.println("test5 异常数");//超过配置的异常数后，熔断
        int a = 1/0;
        return "EEEEEEEE";
    }

    @GetMapping("/testHotKey")
    @SentinelResource(value = "testHotKey",blockHandler = "deal")
    public String testHotkey(@RequestParam(value = "p1",required = false) String p1,
                             @RequestParam(value = "p2",required = false) String p2){
        return "test hotKey!!!";
    }

    public String deal(String p1, String p2, BlockException e){
        return "爆了 爆了！！！";
    }
}
