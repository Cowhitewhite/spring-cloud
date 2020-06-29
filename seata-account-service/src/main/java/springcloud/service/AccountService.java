package springcloud.service;

import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @Classname StorageService
 * @Description TODO
 * @Date 2020/6/29 8:46
 * @Created by ChenHao
 */
public interface AccountService {

    void decrease(Integer userId, BigDecimal money);
}
