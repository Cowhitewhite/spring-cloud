package springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import springcloud.domain.Order;

/**
 * @Classname OrderDao
 * @Description TODO
 * @Date 2020/6/29 13:59
 * @Created by ChenHao
 */
@Mapper
public interface OrderDao {

    void create(Order order);

    void update(@Param("userId") Integer userId,@Param("status") Integer status);
}
