package max;
class Raja extends Thread
{    Table t; 
	Raja(Table t)
	{
	  this.t=t;
	}
	public void run()
	{
		t.table(1);
	}
}
class Kalu extends Thread
{   Table t;
	Kalu(Table t)
	{
	  this.t=t;
	}
	public void run()
	{
		t.table(101);
	}
}
class Rani extends Thread
{     Table t;
	Rani(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.table(10);
		//Table.table(10);
	}
}
public class B {
public static void main(String[] args) throws InterruptedException {
	Table t = new Table();
	Kalu k = new Kalu(t);
	Rani r = new Rani(t);
	Raja rr = new Raja(t);
	
	r.start();
	r.setPriority(10);
	r.join();
	k.start();
	rr.start();
}
}
