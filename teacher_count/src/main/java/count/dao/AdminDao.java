package count.dao;


import count.model.User;

public interface AdminDao extends UserDao {

    public void display();              //所示所有人信息

    //public void reviewPersonal(String teacherId);        //人工审核
    public void InsertUser(User user, String teacherId);   //添加用户

    public void DeleteUser(String teacherId);//删除用户

    //修改用户数据
    public void UpdateUser();






}
