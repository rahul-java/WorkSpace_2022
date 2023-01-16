package maxit;

public class Demo {
	private static Demo demo;
	static
	{
		 demo=new Demo();
	}
	public static Demo getDemmmooo()
	{
		return demo;
	}
	
	
	
	private Demo()
	{
		System.out.println("Demooo");
	}
	public  void hello()
	{
		System.out.println("hello");
	}
	public  void ok()
	{
		System.out.println("ok");  // 10
	}
	
	public  void bye()
	{
		System.out.println("bye");
	}
	public  void thik()
	{
		System.out.println("thik");
	}

}
