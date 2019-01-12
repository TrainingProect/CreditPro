package dao;

public interface UserDao {

    public void personal(String teacherId);    //显示个人信息

    public void changePersonal(String teacherId, int age, String name, String phone);   //修改个人信息

    public void changePWD(String teacherId, String password);  //更改个人密码

    public void findTeam(String name);     //查询自己所在小组信息

    public void findRRule(String teacherId);     //查询业绩标准信息

    public void findAward(String teacherId);     //查询获奖信息

    public void findLunWen(String teacherId);     //查询论文信息

    public void findIdentify(String teacherId);     //查询论文信息

    public void findDProject(String teacherId);     //查询论文信息

    public void findArt(String teacherId);     //查询艺术信息

    public void findBook(String teacherId);     //查询著作信息

    public void findLaw(String teacherId);     //查询著作权信息


    //录入或更改项目小组信息
    public void TeamData(String teacherId, String name, String kind, String allNumber
            , String num1, String num2, String num3, String num4, String num5, String num6, String Atime1, String Status1);

    //录入或更改获奖信息
    public void AwardData(String teacherId, String AwardName, String ResultName, String Unit, int AwardNumber,
                          String Department, String AwardTime, String Level1, String Level2, String CompleteUnit,
                          int CompleteNumber, int UnitLevel, String AwardID, String StudyType, String OneStudy,
                          String ProjectSource, String Kind1, String Kind2, String Award);

    //录入或更改论文信息
    public void LunWenData(String teacherId, String Title, String Kind, String STime, String PublicationName,
                           String Collection, String Unit, String StudyType, String OneStudy, String ProjectSource,
                           int Count, String School, String PublicationLevel, String IfTranslation,
                           String CN, String PublicationRange);


    //录入或更改项目结题信息
    public void DProjectData(String teacherId, String ID, String ResultName, String Unit, String ProjectUnit, String ETime,
                             String IfApply, String StudyType, String ApplyObject, String OneStudy, String ProjectSource,
                             String School, String Evaluate, int Money1, int Money2);


    //录入或更改艺术作品信息
    public void ArtData(String teacherId, String ResultName, String Unit, String STime, String PublicationName,
                        String IfAward, String Kind, String School);

    //录入或更改著作信息
    public void BookData(String teacherId, String Name, String Unit, String PublishUnit, String StartTime, String Sp,
                         String Kind, String StudyType, String OneStudy, String ProjectSource, int Count, String IfTranslation,
                         String School, String Language, String ISBN, String CIP, String Level, String IfAid, String Introduction);

    //录入或更改著作权信息
    public void LawData(String teacherId, String Name, String ID, String Unit, String Registration, String Kind,
                        String STime, String StudyType, String OneStudy);

    public void Count(String teacherId);  //计算绩点(未完成)
}
