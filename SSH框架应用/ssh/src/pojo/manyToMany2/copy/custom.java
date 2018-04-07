package pojo.manyToMany2.copy;
//Ë«Ïò¹ØÁª
import java.util.HashSet;
import java.util.Set;

public class custom {
  private Integer id;
  private String name;
  private Set<Good> teams = new HashSet<Good>(0);
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
public Set<Good> getTeams() {
	return teams;
}
public void setTeams(Set<Good> teams) {
	this.teams = teams;
}
  
}
