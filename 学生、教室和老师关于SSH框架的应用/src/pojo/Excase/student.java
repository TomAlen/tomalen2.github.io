package pojo.Excase;

import java.util.ArrayList;
import java.util.List;

public class student {
   private String name;
   private Integer id;
   private String stuId;
   private List<String> familyPhone = new ArrayList<String>(0);
   private classz myClassz;//学生对班级是多对一的双向关联，班长对班级是一对一，双向
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getStuId() {
	return stuId;
}
public void setStuId(String stuId) {
	this.stuId = stuId;
}
public List<String> getFamilyPhone() {
	return familyPhone;
}
public void setFamilyPhone(List<String> familyPhone) {
	this.familyPhone = familyPhone;
}
public classz getMyClassz() {
	return myClassz;
}
public void setMyClassz(classz myClassz) {
	this.myClassz = myClassz;
}

   
}
