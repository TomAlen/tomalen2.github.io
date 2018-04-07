package pojo.one2;

import java.io.Serializable;

public class student implements Serializable{
	private Integer id;
	private String name;
	private int age;
	private String stuId;
	private dom myDom;
	public dom getMyDom() {
		return myDom;
	}
	public void setMyDom(dom myDom) {
		this.myDom = myDom;
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
	public String getStuId() {
		return stuId;
	}
	public void setStuId(String stuId) {
		this.stuId = stuId;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

}
