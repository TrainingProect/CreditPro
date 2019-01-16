package count.service;

import java.util.List;

import count.model.Art;
import count.model.Award;
import count.model.Book;
import count.model.DProject;
import count.model.Identify;
import count.model.Law;
import count.model.LunWen;
import count.model.PArt;
import count.model.PAward;
import count.model.PBook;
import count.model.PDProject;
import count.model.PIdentify;
import count.model.PLaw;
import count.model.PLunWen;
import count.model.PRRule;
import count.model.RRule;
import count.model.Team;
import count.model.User;

public interface SearchService {
	public User personal(String teacherId);    //显示个人信息
    public List<Team> findTeam(String name);     //查询自己所在小组信息

    public List<RRule> findRRule(String name);     //查询业绩标准信息

    public List<Award> findAward(String name);     //查询获奖信息

    public List<LunWen> findLunWen(String name);     //查询论文信息

    public List<Identify> findIdentify(String name);     //查询项目鉴定信息

    public List<DProject> findDProject(String name);     //查询项目结题信息

    public List<Art> findArt(String name);     //查询艺术信息

    public List<Book> findBook(String name);     //查询著作信息

    public List<Law> findLaw(String name);     //查询著作权信息

    public List<PAward> findPAward(String name);     //查询获奖完成人信息
    public List<PRRule> findPRRule(String name);     //查询业绩标准制定人信息



    public List<PLunWen> findPLunWen(String name);     //查询论文作者信息

    public List<PIdentify> findPIdentify(String name);     //查询论文作者信息

    public List<PDProject>  findPDProject(String name);     //查询项目结题完成人信息

    public List<PArt> findPArt(String name);     //查询艺术作品完成人信息

    public List<PBook> findPBook(String name);     //查询著作作者信息

    public List<PLaw> findPLaw(String name);     //查询著作权作者信息

}
