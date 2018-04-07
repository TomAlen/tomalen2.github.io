package pojo.one2;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class dom implements Serializable{
  private Integer id;
  private String domName;
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
 
}
