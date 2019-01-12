package model;

public class User {

    @Override
    public String toString() {
        return "User{" +
                "password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", teacherId='" + teacherId + '\'' +
                ", post='" + post + '\'' +
                ", count=" + count +
                ", limit1=" + limit1 +
                '}';
    }

    private String password;
    private String name;
    private int age;
    private String phone;
    private String teacherId;
    private String post;
    private int count;
    private int limit1;

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
}
