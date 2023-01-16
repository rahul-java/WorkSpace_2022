package max.threads;

public class ThreadOps {

	public static void main(String[] args) {
		
		System.out.println("Program Started...");
		int x=54+34;
		System.out.println("Sum is : "+x);
		//Thread...
		Thread currentThread = Thread.currentThread();
		System.out.println("Current Running Thread is : "+currentThread.getName());
		
		//setName
		currentThread.setName("RahulThread");
		System.out.println("New Name : "+currentThread.getName());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(currentThread.getId());
		//going to start user defined thread
		
		System.out.println("Program Ended...");
		
		UserThread userThread = new UserThread();
		userThread.start();
	}
}
