package jdbcMySQL;

public class StudentFetchClient {

	public static void main(String[] args) {
		
		StudentDAO dao=new StudentDAO();
		Student s=dao.getStudent(16);
		System.out.println(s.rollNo+"\t"+s.sName);

	}

}
