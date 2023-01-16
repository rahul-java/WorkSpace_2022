package max;

interface Demo1
{
	int num=10;  //final int num=10;
	
	void abc();
	static void show()
	{
		System.out.println("Hi..");
	}
}
class DemoImp1 implements Demo1
{
	public void abc()
	{
		//num=9; we can not change final variable
	}
}
public class InterfaceDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo1.show();
	}

}
