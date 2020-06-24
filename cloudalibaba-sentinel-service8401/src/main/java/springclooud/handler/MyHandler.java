package springclooud.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;

/**
 * @Classname MyHandler
 * @Description TODO
 * @Date 2020/6/24 11:33
 * @Created by ChenHao
 */
public class MyHandler {

    public static String handlerEx(BlockException e){
        return "global Exception!!! 1 ";
    }

    public static String handlerEx2(BlockException e){
        return "global Exception!!!  2";
    }
}
