package springcloud.service;

import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Classname StorageService
 * @Description TODO
 * @Date 2020/6/29 8:46
 * @Created by ChenHao
 */
public interface StorageService {

    void decrease(@RequestParam("productId") Integer productId, @RequestParam("count") Integer count);
}
