package count.service;

import org.springframework.stereotype.Service;

@Service
public interface UserService {
	


    public void personal(String teacherId);    //显示个人信息

    public void changePersonal(String teacherId, int age, String name, String phone);   //修改个人信息

    public void changePWD(String teacherId, String password);  //更改个人密码

    public void findTeam(String name);     //查询自己所在小组信息

    public void findRRule(String name);     //查询业绩标准信息

    public void findAward(String name);     //查询获奖信息

    public void findLunWen(String name);     //查询论文信息

    public void findIdentify(String name);     //查询项目鉴定信息

    public void findDProject(String name);     //查询项目结题信息

    public void findArt(String name);     //查询艺术信息

    public void findBook(String name);     //查询著作信息

    public void findLaw(String name);     //查询著作权信息

    public void findPRRule(String name);     //查询业绩标准制定人信息

    public void findPAward(String name);     //查询获奖完成人信息

    public void findPLunWen(String name);     //查询论文作者信息

    public void findPIdentify(String name);     //查询论文作者信息

    public void findPDProject(String name);     //查询项目结题完成人信息

    public void findPArt(String name);     //查询艺术作品完成人信息

    public void findPBook(String name);     //查询著作作者信息

    public void findPLaw(String name);     //查询著作权作者信息


    //录入或更改项目小组信息
    public void TeamData();

    //录入或更改获奖信息
    public void AwardData();

    //录入或更改论文信息
    public void LunWenData();


    //录入或更改项目结题信息
    public void DProjectData();


    //录入或更改艺术作品信息
    public void ArtData();

    //录入或更改著作信息
    public void BookData();

    //录入或更改著作权信息
    public void LawData();

    //录入或更改业绩标准信息
    public void RRuleData();

    //录入或更改业绩标准制定人信息
    public void PRRuleData();

    //录入或更改获奖完成人信息
    public void PAwardData();

    //录入或更改项目鉴定信息
    public void IdentifyData();

    //录入或更改鉴定完成人信息
    public void PIdentifyData();

    //录入或更改论文作者信息
    public void PLunWenData();

    //录入或更改项目结题完成人信息
    public void PDProjectData();

    //录入或更改艺术作品完成人信息
    public void PArtData();

    //录入或更改著作作者信息
    public void PBookData();

    //录入或更改著作权作者信息
    public void PLawData();

    public void Count();  //计算绩点
}
