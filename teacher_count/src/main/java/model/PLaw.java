package model;

public class PLaw {

    private String teacherId;
    private int ID;   //署名顺序
    private String Name; //作者姓名
    private String Sex;   //性别
    private String Kind; //作者类型
    private String Education; //学历
    private String Job; //职称
    private String Unit; //工作单位
    private int Contribution; //贡献率


    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    public int getContribution() {
        return Contribution;
    }

    public void setContribution(int contribution) {
        Contribution = contribution;
    }

    public String getKind() {
        return Kind;
    }

    public void setKind(String kind) {
        Kind = kind;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEducation() {
        return Education;
    }

    public void setEducation(String education) {
        Education = education;
    }

    public String getJob() {
        return Job;
    }

    public void setJob(String job) {
        Job = job;
    }

    public String getUnit() {
        return Unit;
    }

    public void setUnit(String unit) {
        Unit = unit;
    }

    @Override
    public String toString() {
        return "PLaw{" +
                "ID=" + ID +
                ", Name='" + Name + '\'' +
                ", Sex='" + Sex + '\'' +
                ", Kind='" + Kind + '\'' +
                ", Education='" + Education + '\'' +
                ", Job='" + Job + '\'' +
                ", Unit='" + Unit + '\'' +
                ", Contribution=" + Contribution +
                '}';
    }
}
