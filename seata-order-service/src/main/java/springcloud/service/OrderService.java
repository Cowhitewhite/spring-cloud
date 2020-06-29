package springcloud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springcloud.entity.Order;
import springcloud.repository.OderRepository;

/**
 * @Classname OrderService
 * @Description TODO
 * @Date 2020/6/24 17:15
 * @Created by ChenHao
 */
@Service
public class OrderService {

    @Autowired
    private OderRepository oderRepository;

    public void create(Order order){
        oderRepository.save(order);
    }

    public void update(Integer userId,Integer status){
        oderRepository.updateByIdAndStatus(userId,status);
    }

}
