package lee.github.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * eureka调用者
 */
@SpringBootApplication
@EnableEurekaClient
public class EurekaCliApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaCliApplication.class, args);
    }
}
