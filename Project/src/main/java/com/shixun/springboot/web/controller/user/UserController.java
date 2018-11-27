package com.shixun.springboot.web.controller.user;


import javax.annotation.Resource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shixun.springboot.model.User;
import com.shixun.springboot.service.UserService;


@ComponentScan({"com.shixun.springboot.service"})
@MapperScan("com.shixun.springboot.mapper")
@RestController
public class UserController {

	@Resource(name="userService")
    private UserService userService;
    

	@RequestMapping("/user")  
    public User findUser(){ 
        return userService.findUser("wang");
    }
   
   
}
