package max;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>
{
	int rollNo;
	int marks;
	String name;
	
	public Student(int rollNo,int marks,String name)
	{
		super();
		this.rollNo=rollNo;
		this.marks=marks;
		this.name=name;
		
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", marks=" + marks + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Student s) {
		// TODO Auto-generated method stub
		//return marks>s.marks?1:-1;
		return name.length()>s.name.length()?1:-1;
	}

}

public class ComparatorInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Student> studs=new ArrayList<Student>();
		studs.add(new Student(001, 95, "Rahul"));
		studs.add(new Student(002, 87, "Rohit"));
		studs.add(new Student(003, 85, "Parul"));
		studs.add(new Student(004, 79, "Ronit"));
		
		Collections.sort(studs);
		
		for(Student std:studs)
		{
			System.out.println(std);
		}
	}

}
