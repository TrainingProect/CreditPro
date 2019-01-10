package dao;

public interface UserDao {

    public void personal(String teacherId);    //显示个人信息
    public void changePWD(String teacherId,String password);  //更改个人密码
    public void addData();  //录入小组数据
    public void Count(String teacherId);  //计算绩点
}
