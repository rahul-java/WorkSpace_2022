package max;

interface Demo
{
	void abc();
	
	default void show()
	{
		System.out.println("in Demo show...");
	}
}
interface MyDemo
{
	default void show()
	{
		System.out.println("in MyDemo show...");
	}
}
class DemoImp implements Demo, MyDemo
{

	@Override
	public void abc() {
		System.out.println("in abc...");
	}
	/*
	public void show()
	{
		System.out.println("in new show...");
	}
	*/

	@Override
	public void show() {
		// TODO Auto-generated method stub
		MyDemo.super.show();
		//System.out.println("In DemoImp show...");
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
	
		Demo obj=new DemoImp();
		obj.show();
		obj.abc();
	}

}
