package springcloud.service.impl;

import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springcloud.dao.StorageDao;
import springcloud.domain.CommonResult;
import springcloud.domain.Storage;
import springcloud.service.StorageService;

/**
 * @Classname StorageServiceImpl
 * @Description TODO
 * @Date 2020/6/29 14:55
 * @Created by ChenHao
 */
@Service
public class StorageServiceImpl implements StorageService {

    @Autowired
    private StorageDao storageDao;

    @Override
    public void decrease(Integer productId, Integer count) {
        System.out.println("==========>storage中扣减库存");
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        storageDao.decrease(productId,count);
    }
}
