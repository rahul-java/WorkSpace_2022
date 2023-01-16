package max;

interface ABCD
{
	void show();
}

class Implementer implements ABCD
{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
		System.out.println("In Implementer class...");
	}
	
}
public class InterfaceDemo1
{
  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ABCD obj=new Implementer();
		obj.show();
		
	}

}
