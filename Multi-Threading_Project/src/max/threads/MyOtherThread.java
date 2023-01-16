package max.threads;

//Creating thread using Thread class
public class MyOtherThread extends Thread {

	@Override
	public void run() {
		
		for(int i=10;i>0;i--)
		{
			System.out.println("Another value of i : "+i);
			try {
				Thread.sleep(2000);
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
}
