package pojo.Excase;

public class teacher {
   private Integer id;
   private String name;
   private String teacherNo;
   private classz manageClassz;//与班级是多对多，单向，在classz上维护；班主任是一对一，双向
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
public String getTeacherNo() {
	return teacherNo;
}
public void setTeacherNo(String teacherNo) {
	this.teacherNo = teacherNo;
}
public classz getManageClassz() {
	return manageClassz;
}
public void setManageClassz(classz manageClassz) {
	this.manageClassz = manageClassz;
}
   
}
