package springcloud.filter;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.Date;

/**
 * @Classname MyGatewayFilter
 * @Description TODO
 * @Date 2020/6/18 11:46
 * @Created by ChenHao
 */
@Component
public class MyGatewayFilter implements GlobalFilter, Ordered {

    //实现自定义过滤器
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        System.out.println("*******come in MyGatewayFilter"+new Date());
        String name = exchange.getRequest().getQueryParams().getFirst("uname");
        if (name == null){
            System.out.println("用户名为空，非法");
            exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
            return exchange.getResponse().setComplete();
        }
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
