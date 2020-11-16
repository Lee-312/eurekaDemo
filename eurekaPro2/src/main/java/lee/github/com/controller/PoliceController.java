package lee.github.com.controller;

import lee.github.com.beans.Police;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lixiaoqi
 * @create 2020-11-11 10:24
 */
@RestController
public class PoliceController {
    @GetMapping("/call/{id}")
    public Police call(@PathVariable Integer id){
        Police police = new Police();
        police.setId(id);
        police.setName("张三");
        police.setMessage("AAA");

        return police;
    }
}
