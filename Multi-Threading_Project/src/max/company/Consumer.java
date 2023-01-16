package max.company;

public class Consumer extends Thread {

	
	Company company;
	
	public Consumer(Company company) {
		this.company=company;
	}
	@Override
	public void run() {
		
		while(true)
		{
			this.company.consumeItem();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}
