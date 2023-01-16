package max.threads;

public class UserThread extends Thread {
	
	@Override
	public void run() {
		//task for thread
		System.out.println("This is user defined thread...");
	}

}
