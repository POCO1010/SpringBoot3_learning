package boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author wuxiaofan
 * @Date 2023/7/26 22:39
 * @PackageName:boot.controller
 * @ClassName: HelloController
 * @Description: TODO
 * @Version 1.0
 */
//@ResponseBody
//@Controller
    // @RestController 包含@ResponseBody与@Controller
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello ,Spring Boot 3!";
    }
}
