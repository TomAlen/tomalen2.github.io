package pojo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class student {
	private Integer id;
	private String name;
	private int age;
	private String stuId;
	private Map<String,String> concats=new HashMap<String,String>(0);
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
//	public Map<String, String> getQqs() {
//		return qqs;
//	}
//	public void setQqs(Map<String, String> qqs) {
//		this.qqs = qqs;
//	}
	
	public Map<String, String> getConcats() {
		return concats;
	}
	public void setConcats(Map<String, String> concats) {
		this.concats = concats;
	}

}
