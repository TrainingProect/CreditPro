package count.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.catalina.connector.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import count.bace.ApiResponse;
import count.dao.UserDao;
import count.model.User;
import count.service.UserService;
import count.service.impl.UserServiceImpl;

@RestController
public class UserController {
	
//	@Autowired
//	private UserDao userDao;
//	@RequestMapping("/index")
//	public String index(Integer id) {
//		User findUser = userDao.findOne(id);
//		System.out.println(findUser.getName());
//		return "success";
//	}


    @Autowired
    private UserDao userDao;
    
    @Autowired
    private UserService userService;


    @RequestMapping("/showUser")
    public String showUser(User user,HttpServletRequest request){
    	String teacherId = request.getParameter("teacherId");
    	Integer i = null;
    	if(teacherId!=null&&teacherId!="") {
    		i = Integer.valueOf(teacherId);
    	}else {
    		 return "请输入正确的教师工号！";
		}
    	user=null;
    	if(i!=null) {
        	user = userDao.findOne(i);	
    	}
    	if(user!=null) {
        	request.setAttribute("user", user);
        	return "gerenzhongxin";
    	}else {
            return "查无此人！";
    	}
    }
//    String teacherId, int age, String name, String phone
    @RequestMapping("/")
    public String changeUserInfo(User user,HttpServletRequest request) {
    	String teacherId = request.getParameter("teacherId");
    	String age01 = request.getParameter("age");
    	String name = request.getParameter("name");
    	String phone = request.getParameter("phone");
    	Integer integer = Integer.valueOf(age01);
    	int age = integer.intValue();
    	userService = new UserServiceImpl();
    	User user1 = userService.changePersonal(teacherId, age, name, phone);
    	request.setAttribute("user", user1);
    	return "";
    }
    
    
    
    
    
    
    
    

}
