package springcloud;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;

import javax.servlet.ServletRegistration;

/**
 * @Classname HystrixDashboard
 * @Description TODO
 * @Date 2020/6/17 15:30
 * @Created by ChenHao
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboard {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboard.class,args);
    }
}
