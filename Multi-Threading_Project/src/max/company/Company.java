package max.company;

public class Company {

	int n;
	boolean f=false;
	
	//f=false chance:Producer
	//f=true chance:Consumer
	
	//Producer
	synchronized public void produceItem(int n)
	{
		if(f)
		{
	      try {
			wait();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		}
		f=true;
		notify();
		this.n=n;
		System.out.println("Produced :==>"+this.n);
	}
	
	//Consumer
		synchronized public int consumeItem()
		{
			if(!f)
			{
		      try {
				wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			}
			System.out.println("Consumed :<=="+this.n);
			f=false;
			notify();
			return this.n;
		}
}
