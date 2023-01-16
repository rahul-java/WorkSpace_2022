package max;
class Arun extends Thread
{
	public void run()
	{   for(int i=0;i<=100;i++)
	{
		D.printtt("A");
System.out.println(Thread.currentThread().isAlive());
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
}
class Varun extends Thread
{
	public void run()
	{  for(int i=0;i<=100;i++)
	{
		D.printtt("B");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
}
public class AA {
public static void main(String[] args) throws InterruptedException {
	Arun ar = new Arun();
	ar.start();
	ar.setPriority(10);
	Varun vr = new Varun();
	vr.start();
	for(int i=1;i<=10;i++)
	{
	Thread.sleep(1000);
	System.out.println("main--- "+Thread.MAX_PRIORITY);
	}
}
}
