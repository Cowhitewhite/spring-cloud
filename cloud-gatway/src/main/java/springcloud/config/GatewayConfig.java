package springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Classname GatewayConfig
 * @Description TODO
 * @Date 2020/6/18 11:00
 * @Created by ChenHao
 */
@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator routes(RouteLocatorBuilder builder){

        RouteLocatorBuilder.Builder routes = builder.routes();
        routes.route("path_route_test",r -> r.path("/guonei")
                .uri("http://news.baidu.com/guonei")).build();

        return routes.build();
    }
}
