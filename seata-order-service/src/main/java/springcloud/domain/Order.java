package springcloud.domain;

import lombok.Data;
import java.math.BigDecimal;

/**
 * @Classname Order
 * @Description TODO
 * @Date 2020/6/24 16:59
 * @Created by ChenHao
 */
@Data
public class Order {

    private Integer id;

    private Integer userId;

    private Integer productId;

    private Integer count;

    private BigDecimal money;

    private Integer status;
}
