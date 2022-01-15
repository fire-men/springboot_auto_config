package com.wolf.autoConfig;

import com.wolf.common.domain.User;
import com.wolf.common.service.IUserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author jingjing520
 * Springboot自动配置测试
 */
@SpringBootApplication
public class App {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(App.class);
        IUserService userService = applicationContext.getBean(IUserService.class);
        //IUserService userService = (IUserService) applicationContext.getBean("userServiceImpl");
        userService.sayHello("==张乐");

        //当修改完common模块的内容后，不需要重新在install到本地，会自动感知
        System.out.println(new User("张三","zs123456"));
    }
}
