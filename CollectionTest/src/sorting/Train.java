package sorting;

public class Train implements Comparable<Train>{
 int time;
 String name;
 String sstn;
 String dstn;
public int getTime() {
	return time;
}
public void setTime(int time) {
	this.time = time;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSstn() {
	return sstn;
}
public void setSstn(String sstn) {
	this.sstn = sstn;
}
public String getDstn() {
	return dstn;
}
public void setDstn(String dstn) {
	this.dstn = dstn;
}

public int compareTo(Train t) {
	if(time==t.getTime())
	return 0;
	else if(time>t.getTime())
		return 1;
	return -1;
	
	//return name.compareTo(t.getName());
}
 
}
