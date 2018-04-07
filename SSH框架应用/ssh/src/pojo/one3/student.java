package pojo.one3;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class student implements Serializable{
	private Integer id;
	private String name;
	private int age;
	private String stuId;
    private dom dom;
	
	public dom getDom() {
		return dom;
	}
	public void setDom(dom dom) {
		this.dom = dom;
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
