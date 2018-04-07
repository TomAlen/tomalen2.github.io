package pojo.single2;

public class person {
     private String name;
     private Integer id;
     private VipCard mycard;
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
	public VipCard getMycard() {
		return mycard;
	}
	public void setMycard(VipCard mycard) {
		this.mycard = mycard;
	}
	@Override
	public String toString() {
		return "person [name=" + name + ", id=" + id + ", mycard=" + mycard + "]";
	}
     
}
