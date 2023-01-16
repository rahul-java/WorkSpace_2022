package max;

class Student
{
	private int rollno;      //data safe.
	private String name;
	
	//Encapsulation : Binding your data with your methods.
	// Getters and Setters
	
	public int getRollno() {
		System.out.println("User is accessing  the value.");
		return rollno;
	}
	public void setRollno(int rollno) {
		System.out.println("User has changed the value.");
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
public class EncapsulationDemo {

	public static void main(String[] args) {
		
		Student std=new Student();
		
		//std.rollno=101;
		//std.name="Rahul";
		
		std.setRollno(101);
		std.setName("Rahul");
		System.out.println(std.getRollno()+"\t"+std.getName());

	}

}
