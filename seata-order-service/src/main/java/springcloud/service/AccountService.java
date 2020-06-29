package springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import springcloud.domain.CommonResult;

import java.math.BigDecimal;

/**
 * @Classname accountService
 * @Description TODO
 * @Date 2020/6/29 8:52
 * @Created by ChenHao
 */
@Service
@FeignClient("seata-account-service")
public interface AccountService {

    @PostMapping("/account/decrease")
    CommonResult decrease(@RequestParam("userId") Integer userId, @RequestParam("money") BigDecimal money);
}
