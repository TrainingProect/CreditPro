package count.service;

import org.springframework.stereotype.Service;


public interface AdminService {
    public void FindID(String teacherId);    //查询用户(根据ID查询用户)

    public void FindName(String name);    //查询用户(根据姓名查询用户)
}
