package jdbcMySQL;

public class StudentClient {

	public static void main(String[] args) 
	{
		StudentDAO dao=new StudentDAO();
		//Student s1=dao.getStudent(4);
		//System.out.println(s1.rollNo+"\t"+s1.sName);
		
		Student s2=new Student();
		s2.rollNo=16;
		s2.sName="Manish";
		int i=dao.addStudent(s2);
		if(i>0)
		{
			System.out.println("Inserted SUCCESSFULLY...");
		}
		else
		{
			System.out.println("Something went WRONG...");
		}
		

	}

}
