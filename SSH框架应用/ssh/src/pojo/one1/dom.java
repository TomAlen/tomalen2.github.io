package pojo.one1;

import java.util.HashSet;
import java.util.Set;

public class dom {
  private Integer id;
  private String domName;
  private Set<student> student = new HashSet<student>(0);
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getDomName() {
	return domName;
}
public void setDomName(String domName) {
	this.domName = domName;
}
public Set<student> getStudent() {
	return student;
}
public void setStudent(Set<student> student) {
	this.student = student;
}
  
  
  
  
  
}
