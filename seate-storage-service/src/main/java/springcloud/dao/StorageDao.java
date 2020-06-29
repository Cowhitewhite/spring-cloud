package springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import springcloud.domain.Storage;

/**
 * @Classname OrderDao
 * @Description TODO
 * @Date 2020/6/29 13:59
 * @Created by ChenHao
 */
@Mapper
public interface StorageDao {

    void decrease(@Param("productId") Integer productId, @Param("count") Integer count);
}
