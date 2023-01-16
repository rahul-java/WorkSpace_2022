package max;

public class T extends Thread{
	  int totl=0;
	public void run()
	{
		synchronized (this) {
			for(int i=1; i<=30;i++)
		    {
			totl+=i;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
			notify();
		}
	}
	
	public static void main(String[] args) {
		T t = new T();
		t.start();
		try {
			synchronized (t) {
				
			
			t.wait();
			System.out.println("totol "+(t.totl));
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
			}

}
