package set;

public class Emp {
  int eid;
  String name;
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public int hashCode() {
	return 1;
	}

public boolean equals(Object obj) {
	Emp e = (Emp)obj;
	return name.equals(e.getName());
}
  




}
