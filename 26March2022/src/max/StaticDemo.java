package max;

class Employee
{
	int emp_id;
	int salary;
	//String ceo;
	static String ceo;
	
	static       //when you load a class;
	{
		//emp_id=0;    non static variables can not be called inside static method or static block.
		ceo="Jeff Bejosh";
		System.out.println("In Static....");
	}
	public Employee()         //when you create an object;
	{
		emp_id=101;
		salary=3000;
		System.out.println("In Constructor.....");
		
	}
	public void show()
	{
		System.out.println(emp_id+"\t"+salary+"\t"+ceo);
	}
}
public class StaticDemo {
	static int i;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         i=10;   /// non static variables can not be called inside static method or static block.
		Employee rahul=new Employee();
		//rahul.emp_id=111;
		//rahul.salary=6000;
		//rahul.ceo="Veerpal";
		//Employee.ceo="Veerpal";
		
		Employee rohit=new Employee();
		//rohit.emp_id=222;
		//rohit.salary=8000;
		//rohit.ceo="Veerpal";
		
		//Employee.ceo="naveen";//we dont need object.
		
		rahul.show();
		rohit.show();
		
	}

}
