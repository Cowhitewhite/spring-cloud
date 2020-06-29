package springcloud.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * @Classname Order
 * @Description TODO
 * @Date 2020/6/24 16:59
 * @Created by ChenHao
 */
@Data
@Entity
@Table(name = "t_order")
public class Order {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private Integer userId;

    private Integer productId;

    private Integer count;

    private BigDecimal money;

    private Integer status;
}
