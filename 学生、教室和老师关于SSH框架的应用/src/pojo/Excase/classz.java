package pojo.Excase;

import java.util.HashSet;
import java.util.Set;

public class classz {
    private Integer id;
    private String name;
    private Set<student> members = new HashSet<student>(0);
    private student moniter;
    private Set<teacher> teachers = new HashSet<teacher>(0);
    private teacher claManage;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<student> getMembers() {
		return members;
	}
	public void setMembers(Set<student> members) {
		this.members = members;
	}
	public student getMoniter() {
		return moniter;
	}
	public void setMoniter(student moniter) {
		this.moniter = moniter;
	}
	public Set<teacher> getTeachers() {
		return teachers;
	}
	public void setTeachers(Set<teacher> teachers) {
		this.teachers = teachers;
	}
	public teacher getClaManage() {
		return claManage;
	}
	public void setClaManage(teacher claManage) {
		this.claManage = claManage;
	}
    
}
