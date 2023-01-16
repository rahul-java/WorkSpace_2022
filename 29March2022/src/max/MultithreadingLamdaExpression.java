package max;
/*
class Hi1 implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Hi..");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
}

class Hello1 implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Hello..");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
}*/

public class MultithreadingLamdaExpression {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub

		Runnable obj1=()->
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("Hi..");
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
			}
		} ;
		Runnable obj2=()->
		{
			
				for(int i=0;i<5;i++)
				{
					System.out.println("Hello..");
					try {
						Thread.sleep(1000);
					} 
					catch (InterruptedException e) 
					{
						e.printStackTrace();
					}
				}
		};
		
		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);
		
		System.out.println(t1.getName()+"  "+t2.getName());
		t1.setName("Hi Thread");
		t2.setName("Hello Thread");
		System.out.println(t1.getName()+"  "+t2.getName());
		t1.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		t2.start();
	
		System.out.println(t1.isAlive());
		t1.join();
		t2.join();
		System.out.println(t1.isAlive());
		System.out.println("Bye");
		}
	}

