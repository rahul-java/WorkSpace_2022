package max;

public class ThreadDemo111 {
	
		public static void main(String[] args) throws Exception
		{
			// TODO Auto-generated method stub

			Thread t1=new Thread(() ->
			{
				for(int i=0;i<5;i++)
				{
					System.out.println("Hi.."+Thread.currentThread().getPriority());
					
					try {Thread.sleep(1000);} catch (InterruptedException e){e.printStackTrace();}
				}
			},"First Thread");
				
			Thread t2=new Thread(()->
			{
				
					for(int i=0;i<5;i++)
					{
						System.out.println("Hello..");
						try {
							Thread.sleep(1000);
						} 
						catch (InterruptedException e) 
						{
							e.printStackTrace();
						}
					}
			}, "SEcond Thread");
			
			System.out.println(t1.getPriority());
			System.out.println(t2.getPriority());
			t1.setPriority(10);
			t2.setPriority(1);
			System.out.println(t1.getPriority());
			System.out.println(t2.getPriority());
			t1.setPriority(Thread.MIN_PRIORITY);
			t2.setPriority(Thread.MAX_PRIORITY);
			System.out.println(t1.getPriority());
			System.out.println(t2.getPriority());
			
			System.out.println(t1.getName()+"  "+t2.getName());
			//t1.setName("Hi Thread");
			//t2.setName("Hello Thread");
			System.out.println(t1.getName()+"  "+t2.getName());
			t1.start();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			t2.start();
		
			System.out.println(t1.isAlive());
			t1.join();
			t2.join();
			System.out.println(t1.isAlive());
			System.out.println("Bye");
			}
		}

