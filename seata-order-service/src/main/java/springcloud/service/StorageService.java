package springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import springcloud.domain.CommonResult;

/**
 * @Classname StorageService
 * @Description TODO
 * @Date 2020/6/29 8:46
 * @Created by ChenHao
 */
@Service
@FeignClient(value = "seata-storage-service")
public interface StorageService {

    @PostMapping("/storage/decrease")
    CommonResult decrease(@RequestParam("productId") Integer productId,@RequestParam("count") Integer count);
}
