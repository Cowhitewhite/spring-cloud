package springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Classname MyBatisConfig
 * @Description TODO
 * @Date 2020/6/29 14:24
 * @Created by ChenHao
 */
@Configuration
@MapperScan({"springcloud.dao"})
public class MyBatisConfig {
}
