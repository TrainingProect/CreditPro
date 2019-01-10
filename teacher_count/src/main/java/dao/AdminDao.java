package dao;


import model.User;

public interface AdminDao {

    public void display();              //所示所有人信息
    public void InsertUser(User user, String teacherId);   //添加用户
    public void FindID(String teacherId);    //查询用户(根据ID查询用户)
    public void FindName(String name);    //查询用户(根据姓名查询用户)
    public void UpdateUser(int age, String teacherId, String name, String phone, String post, int limit, int count, String password);
    //修改用户数据
    public void DeleteUser(String teacherId);//删除用户

}
