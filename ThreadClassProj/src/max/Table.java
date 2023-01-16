package max;

public class Table {
	//public  synchronized void table(int n)
	public   void table(int n)
	{   
	//	System.out.println("Registration "+n);
		//synchronized (this) {
			for(int i=1; i<=10;i++)
		{
			System.out.println(n*i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//}
	}

}
