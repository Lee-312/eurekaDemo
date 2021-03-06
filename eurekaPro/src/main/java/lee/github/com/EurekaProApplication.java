package lee.github.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * eureka提供者
 */
@SpringBootApplication
@EnableEurekaClient
public class EurekaProApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaProApplication.class, args);
    }
}

