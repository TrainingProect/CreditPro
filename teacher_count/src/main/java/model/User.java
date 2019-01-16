package model;

public class User {


    private String teacherId;   //工号
    private String name;   //教师姓名
    private int age;    //教师年龄
    private String phone;   //预留手机号
    private String post;   //所属学院
    private int count;   //绩点
    private int limit1;   //权限
    private String password;  //密码

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getLimit1() {
        return limit1;
    }

    public void setLimit1(int limit1) {
        this.limit1 = limit1;
    }

    @Override
    public String toString() {
        return "User{" +
                "teacherId='" + teacherId + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", post='" + post + '\'' +
                ", count=" + count +
                ", limit1=" + limit1 +
                '}';
    }
}
