package springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @Classname OrderDao
 * @Description TODO
 * @Date 2020/6/29 13:59
 * @Created by ChenHao
 */
@Mapper
public interface AccountDao {

    void decrease(@Param("userId") Integer userId, @Param("money") BigDecimal money);
}
