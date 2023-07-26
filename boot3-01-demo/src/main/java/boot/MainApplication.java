package boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author wuxiaofan
 * @Date 2023/7/26 22:33
 * @PackageName:boot
 * @ClassName: MainApplication
 * @Description: 启动SpringBoot项目的主入口程序
 * @Version 1.0
 */

@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class,args);
    }
}
