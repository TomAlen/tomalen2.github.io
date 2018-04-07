package pojo.manyToMany2.copy;

import java.util.HashSet;
import java.util.Set;

public class Good {
  private String name;
  private Integer id;
  private Set<custom> customs = new  HashSet<custom>(0);
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
public Set<custom> getCustoms() {
	return customs;
}
public void setCustoms(Set<custom> customs) {
	this.customs = customs;
}
  
  
}
