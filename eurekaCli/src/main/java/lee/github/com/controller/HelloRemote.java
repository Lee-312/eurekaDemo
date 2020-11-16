package lee.github.com.controller;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lixiaoqi
 * @create 2020-11-16 16:04
 */
@FeignClient(name = "spring-cloud-producer", fallback = HelloRemoteHystrix.class)
//添加指定fallback类，在服务熔断的时候返回fallback类中的内容。
public interface HelloRemote {
    @RequestMapping(value = "/hello")
    public String hello(@RequestParam(value = "name") String name);
}
