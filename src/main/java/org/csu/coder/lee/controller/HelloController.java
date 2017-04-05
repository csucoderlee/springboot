package org.csu.coder.lee.controller;

import org.csu.coder.lee.domain.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by csucoderlee on 2017 04 03 下午10:05.
 * @RestController 区别于 @Controller, 多了一个@ResponseBody的注解
 */

@RestController
public class HelloController {

    @GetMapping(value = "/getHello")
    public String getHello(){
        return "hello spring boot!";
    }

    @PostMapping(value = "postHello")
    public String postHello(String helloStr){
        return "接收到的post请求参数的内容：" + helloStr;
    }

    /**
     * spring webmvc中, json 需要 @Controller 结合 @ResponseBody使用
     * spring boot中只需要@RestController, 在其注解声明中添加了, @ResponseBody
     * spring boot 默认使用jackson, 进行json数据的解析
     * @return
     */
    @GetMapping(value = "/getJson")
    public User getUserJson(){
        User user = new User();
        user.setUsername("csucoderlee");
        user.setPassword("pwd123456");
        return user;
    }

}
