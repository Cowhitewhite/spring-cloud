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
public class Account {

    private Integer id;

    private Integer userId;

    private BigDecimal total;

    private BigDecimal used;

    private BigDecimal residue;
}
