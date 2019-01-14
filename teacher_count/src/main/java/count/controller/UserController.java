package count.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import count.dao.UserDao;
import count.model.User;

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


    @RequestMapping("/showUser")
    public String showUser(String teacherId){
    	User findUser = userDao.findOne(id);
        return "gerenzhongxin";
    }

}
