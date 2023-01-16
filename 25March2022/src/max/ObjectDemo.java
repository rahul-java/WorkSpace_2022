package max;

class Calc
{
	int num1;
	int num2;
	int result;
	
	public void perform()
	{
		result=num1+num2;
	}
	
}
public class ObjectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calc obj;                   // it is a reference.
		obj=new Calc();             //object creation. Object knows something and does something.
		
		obj.num1=3;
		obj.num2=6;
		
		obj.perform();
		System.out.println(obj.result);
	}

}
