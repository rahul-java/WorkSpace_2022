package max.company;

public class Producer extends Thread {

	Company company;
	
	public Producer(Company company ) {
		this.company=company;
	}
	public void run() {
		
		int i=1;
		while(true)
		{
			this.company.produceItem(i);
			i++;
			try
			{
				Thread.sleep(1000);
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}
