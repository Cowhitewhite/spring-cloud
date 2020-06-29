package springcloud.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springcloud.dao.AccountDao;
import springcloud.service.AccountService;

import java.math.BigDecimal;

/**
 * @Classname StorageServiceImpl
 * @Description TODO
 * @Date 2020/6/29 14:55
 * @Created by ChenHao
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao storageDao;

    @Override
    public void decrease(Integer userId, BigDecimal money) {
        System.out.println("==========>account中扣减库存");
        storageDao.decrease(userId,money);
    }
}
