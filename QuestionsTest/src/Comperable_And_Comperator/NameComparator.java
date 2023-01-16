package Comperable_And_Comperator;

import java.util.Comparator;

public class NameComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getName().equals(o2.getName()))
			return o1.getId()-o2.getId();
		return o1.getName().compareTo(o2.getName());
	}

	

}
