package springcloud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import springcloud.entity.Order;

/**
 * @Classname OderRepository
 * @Description TODO
 * @Date 2020/6/24 17:06
 * @Created by ChenHao
 */
@Repository
public interface OderRepository extends JpaRepository<Order, Integer> {

    @Query("UPDATE Order SET status = 1 WHERE userId = ?1 AND status = ?2")
    void updateByIdAndStatus(Integer userId,Integer status);
}
