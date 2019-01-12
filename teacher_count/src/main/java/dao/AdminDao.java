package dao;


import model.User;

public interface AdminDao {

    public void display();              //所示所有人信息

    //public void reviewPersonal(String teacherId);        //人工审核

    public void InsertUser(User user, String teacherId);   //添加用户

    public void FindID(String teacherId);    //查询用户(根据ID查询用户)

    public void FindName(String name);    //查询用户(根据姓名查询用户)

    public void findPRRule(String teacherId);     //查询业绩标准制定人信息

    public void findPAward(String teacherId);     //查询获奖完成人信息

    public void findPLunWen(String teacherId);     //查询论文作者信息

    public void findPIdentify(String teacherId);     //查询论文作者信息

    public void findPDProject(String teacherId);     //查询项目结题完成人信息

    public void findPArt(String teacherId);     //查询艺术作品完成人信息

    public void findPBook(String teacherId);     //查询著作作者信息

    public void findPLaw(String teacherId);     //查询著作作者信息

    //修改用户数据
    public void UpdateUser(int age, String teacherId, String name, String phone, String post, int limit, int count, String password);

    public void DeleteUser(String teacherId);//删除用户

    //录入或更改业绩标准信息
    public void RRuleData(String teacherId, String Name, String Unit, String kind, String Id, String STime,
                          String ETime, String Ifexist, String Department, String Industry);

    //录入或更改业绩标准制定人信息
    public void PRRuleData(String teacherId, int ID, String Kind, String Name, String Sex, String Education,
                           String Job, String Unit, int Contribution);

    //录入或更改获奖完成人信息
    public void PAwardData(String teacherId, int ID, String Kind, String Name, String Sex, String Education,
                           String Job, String Unit, int Contribution);

    //录入或更改项目鉴定信息
    public void IdentifyData(String teacherId, String ResultName, String Unit, String Department, String STime,
                             String Level, String CompleteWay, String StudyType, String OneStudy, String TwoStudy,
                             String ProjectSource, String School, String CompleteUnit, String ID, String Conclusion);

    //录入或更改鉴定完成人信息
    public void PIdentifyData(String teacherId, int ID, String Kind, String Name, String Sex, String Education,
                              String Job, String Unit, int Contribution);

    //录入或更改论文作者信息
    public void PLunWenData(String teacherId, int ID, String Kind, String Name, String Sex, String Education,
                            String Job, String Unit, int Contribution, String IfTell);

    //录入或更改项目结题完成人信息
    public void PDProjectData(String teacherId, int ID, String Kind, String Name, String Sex, String Education,
                              String Job, String Unit, int Contribution);

    //录入或更改艺术作品完成人信息
    public void PArtData(String teacherId, int ID, String Kind, String Name, String Sex, String Education,
                         String Job, String Unit, int Contribution);

    //录入或更改著作作者信息
    public void PBookData(String teacherId, int ID, String Kind, String Name, String Sex, String Education,
                          String Job, String Unit, int Contribution, String Role, int Count);

    //录入或录入著作权作者信息
    public void PLawData(String teacherId, int ID, String Kind, String Name, String Sex, String Education,
                         String Job, String Unit, int Contribution);
}
