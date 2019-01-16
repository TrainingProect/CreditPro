package count.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "user")
public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5308851147902082436L;
	@Id
	@GeneratedValue
	private int Id;
	@Column
	private String teacherId;//工号

	@Column
    private String name;   //教师姓名
	@Column
    private int age;    //教师年龄
	@Column
    private String phone;   //预留手机号
	@Column
    private String post;   //所属学院
	@Column
    private int count;   //绩点
	@Column
    private int limit1;   //权限
	@Column
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

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}



	public String getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}

	@Override
	public String toString() {
		return "User [Id=" + Id + ", teacherId=" + teacherId + ", name=" + name + ", age=" + age + ", phone=" + phone
				+ ", post=" + post + ", count=" + count + ", limit1=" + limit1 + ", password=" + password + "]";
	}







}
