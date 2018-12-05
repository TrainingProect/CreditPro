package com.shixun.springboot.web.controller.user;


import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shixun.springboot.model.User;
import com.shixun.springboot.service.UserService;


@ComponentScan({"com.shixun.springboot.service"})
@MapperScan("com.shixun.springboot.dao")
@RestController
public class UserController {

	@Resource(name="userService")
    private UserService userService;
    
	
	@RequestMapping("/user")  
    public boolean change(User user,Object...objects){ 
        return userService.change(user,objects);
    }
	
	@RequestMapping("/user")
	public User searchUser(String u_teacherId) {
		
		User user = userService.personal(u_teacherId);
		return user;
	}
   
   
}
