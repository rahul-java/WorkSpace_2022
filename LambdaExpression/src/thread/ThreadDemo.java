package thread;

public class ThreadDemo {

	public static void main(String[] args) {
		
		Runnable thread1=()->{
			
			for(int i=1;i<=10;i++)
			{
				System.out.println(2+" * "+i+" =  "+i*2);
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		Thread t1=new Thread(thread1);
		t1.setName("Rahul");
		t1.start();

	}

}
