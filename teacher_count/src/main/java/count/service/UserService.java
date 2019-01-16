package count.service;

import org.springframework.stereotype.Service;

import count.model.User;


public interface UserService {
	



    public User changePersonal(String teacherId, int age, String name, String phone);   //修改个人信息

    public void changePWD(String teacherId, String password);
//    
//  //录入或更改项目小组信息
//    public void TeamData(String teacherId, String name, String kind, String allNumber
//            , String num1, String num2, String num3, String num4, String num5, String num6, String Atime1, String Status1);
//
//    //录入或更改获奖信息
//    public void AwardData(String teacherId, String AwardName, String ResultName, String Unit, int AwardNumber,
//                          String Department, String AwardTime, String Level1, String Level2, String CompleteUnit,
//                          int CompleteNumber, int UnitLevel, String AwardID, String StudyType, String OneStudy,
//                          String ProjectSource, String Kind1, String Kind2, String Award);
//
//    //录入或更改论文信息
//    public void LunWenData(String teacherId, String Title, String Kind, String STime, String PublicationName,
//                           String Collection, String Unit, String StudyType, String OneStudy, String ProjectSource,
//                           int Count, String School, String PublicationLevel, String IfTranslation,
//                           String CN, String PublicationRange);
//
//
//    //录入或更改项目结题信息
//    public void DProjectData(String teacherId, String ID, String ResultName, String Unit, String ProjectUnit, String ETime,
//                             String IfApply, String StudyType, String ApplyObject, String OneStudy, String ProjectSource,
//                             String School, String Evaluate, int Money1, int Money2);
//
//
//    //录入或更改艺术作品信息
//    public void ArtData(String teacherId, String ResultName, String Unit, String STime, String PublicationName,
//                        String IfAward, String Kind, String School);
//
//    //录入或更改著作信息
//    public void BookData(String teacherId, String Name, String Unit, String PublishUnit, String StartTime, String Sp,
//                         String Kind, String StudyType, String OneStudy, String ProjectSource, int Count, String IfTranslation,
//                         String School, String Language, String ISBN, String CIP, String Level, String IfAid, String Introduction);
//
//    //录入或更改著作权信息
//    public void LawData(String teacherId, String Name, String ID, String Unit, String Registration, String Kind,
//                        String STime, String StudyType, String OneStudy);
//
//    //录入或更改业绩标准信息
//    public void RRuleData(String teacherId, String Name, String Unit, String kind, String Id, String STime,
//                          String ETime, String Ifexist, String Department, String Industry);
//
//    //录入或更改业绩标准制定人信息
//    public void PRRuleData(String teacherId, int ID, String Kind, String Name, String Sex, String Education,
//                           String Job, String Unit, int Contribution);
//
//    //录入或更改获奖完成人信息
//    public void PAwardData(String teacherId, int ID, String Kind, String Name, String Sex, String Education,
//                           String Job, String Unit, int Contribution);
//
//    //录入或更改项目鉴定信息
//    public void IdentifyData(String teacherId, String ResultName, String Unit, String Department, String STime,
//                             String Level, String CompleteWay, String StudyType, String OneStudy, String TwoStudy,
//                             String ProjectSource, String School, String CompleteUnit, String ID, String Conclusion);
//
//    //录入或更改鉴定完成人信息
//    public void PIdentifyData(String teacherId, int ID, String Kind, String Name, String Sex, String Education,
//                              String Job, String Unit, int Contribution);
//
//    //录入或更改论文作者信息
//    public void PLunWenData(String teacherId, int ID, String Kind, String Name, String Sex, String Education,
//                            String Job, String Unit, int Contribution, String IfTell);
//
//    //录入或更改项目结题完成人信息
//    public void PDProjectData(String teacherId, int ID, String Kind, String Name, String Sex, String Education,
//                              String Job, String Unit, int Contribution);
//
//    //录入或更改艺术作品完成人信息
//    public void PArtData(String teacherId, int ID, String Kind, String Name, String Sex, String Education,
//                         String Job, String Unit, int Contribution);
//
//    //录入或更改著作作者信息
//    public void PBookData(String teacherId, int ID, String Kind, String Name, String Sex, String Education,
//                          String Job, String Unit, int Contribution, String Role, int Count);
//
//    //录入或更改著作权作者信息
//    public void PLawData(String teacherId, int ID, String Kind, String Name, String Sex, String Education,
//                         String Job, String Unit, int Contribution);
//
//    public void Count(String name);  //计算绩点
}
