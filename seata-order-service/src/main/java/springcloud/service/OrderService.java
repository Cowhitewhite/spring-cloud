package springcloud.service;

import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springcloud.dao.OrderDao;
import springcloud.domain.Order;

/**
 * @Classname OrderService
 * @Description TODO
 * @Date 2020/6/24 17:15
 * @Created by ChenHao
 */
@Service
public class OrderService {

    @Autowired
    private OrderDao orderDao;

    @Autowired
    private StorageService storageService;

    @Autowired
    private AccountService accountService;

    @GlobalTransactional(name = "fsp-create-order",rollbackFor = Exception.class)
    public void create(Order order){
        System.out.println("=======>新建订单");
        orderDao.create(order);
        System.out.println("=======>库存扣减");
        storageService.decrease(order.getProductId(),order.getCount());
        System.out.println("=======>账户扣减");
        accountService.decrease(order.getUserId(),order.getMoney());
        System.out.println("修改订单状态");
        orderDao.update(order.getUserId(),0);
        System.out.println("OK.....");
    }
}
