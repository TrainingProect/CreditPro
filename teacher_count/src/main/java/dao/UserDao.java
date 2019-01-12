package dao;

public interface UserDao {

    public void personal(String teacherId);    //显示个人信息
    public void changePersonal(String teacherId,int age,String name,String phone);   //修改个人信息
    public void changePWD(String teacherId,String password);  //更改个人密码
    public void findTeam(String name);     //查询自己所在小组信息
    //录入或更改项目小组信息
    public void TeamData(String teacherId,String name,String kind,String allNumber
    ,String num1,String num2,String num3,String num4,String num5,String num6,String Atime1,String Status1);
    //录入或更改业绩标准信息
    public void RRuleData(String teacherId,String Name,String Unit,String kind,String Id,String STime,
                             String ETime,String Ifexist,String Department,String Industry);
    //录入或更改业绩标准制定人信息
    public void PRRuleData(String teacherId,int ID,String Kind,String Name,String Sex,String Education,
                           String Job,String Unit,int Contribution);
    //----------------------------
    public void Count(String teacherId);  //计算绩点
}
