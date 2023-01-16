package max.threads;

//Creating thread using Runnable interface
public class MyThread implements Runnable{

	@Override
	public void run() {
		//task for thread
		for(int i=1;i<=10;i++)
		{
			System.out.println("Value of i is : "+i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
public static void main(String[] args) {
	
	MyThread myThread = new MyThread();
	Thread thread = new Thread(myThread);
	
	MyOtherThread myOtherThread = new MyOtherThread();
	
	thread.start();
	myOtherThread.start();
}
	
}
