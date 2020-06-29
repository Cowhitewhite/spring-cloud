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
public class Storage {

    private Integer id;

    private Integer productId;

    private Integer total;

    private Integer used;

    private Integer residue;
}
