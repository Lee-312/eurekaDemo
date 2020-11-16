package lee.github.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * eureka调用者
 */
@SpringBootApplication
@EnableEurekaClient//启用服务注册与发现
@EnableFeignClients//启用feign进行远程调用
/**
 * @EnableHystrixDashboard
 * @EnableCircuitBreaker
 * 熔断监控打开，访问http://localhost:9001/hystrix
 */
@EnableHystrixDashboard
@EnableCircuitBreaker
public class EurekaCliApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaCliApplication.class, args);
    }
}
