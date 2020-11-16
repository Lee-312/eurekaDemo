package lee.github.com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lixiaoqi
 * @create 2020-11-16 15:59
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String index(String name) {
        return "hello " + name + ", this is first message";
    }

}
