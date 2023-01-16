
//public class A extends Thread{
	public class A implements Runnable{
	
	public void run()
	{
		System.out.println("runnn");
	}
	public static void main(String[] args) {
		A b = new A();
	Thread t = new	Thread(b);
		t.start();
	}
}
