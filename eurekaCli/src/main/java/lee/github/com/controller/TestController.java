package lee.github.com.controller;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author lixiaoqi
 * @create 2020-11-11 10:33
 */
@RestController
@Configuration
public class TestController {
    /*
      @LoadBalanced：该RestTemplate具有负载均衡的功能
       */
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @GetMapping("/router")
    public String router() {
        RestTemplate restTemplate = getRestTemplate();
        String json = restTemplate.getForObject("http://first-police/call/100", String.class);
        return json;
    }

}