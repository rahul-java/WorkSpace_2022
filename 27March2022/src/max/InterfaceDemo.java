package max;

interface Writer1            //abstract class Writer1
{
	public abstract void write();
	public void show();
}
class Pen1 implements Writer1             //class Pen1 extends Writer1
{
	public void write()
	{
		System.out.println("In a Pen...");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
}

class Pencil1 implements Writer1
{
	public void write()
	{
		System.out.println("In a Pencil...");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
}

class Kit
{
	public void doSomething(Writer1 p)
	{
		p.write();
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		
		Kit k=new Kit();
		Pen1 p=new Pen1();
		Pencil1 pc=new Pencil1();
		
		//k.doSomething(p);
		//k.doSomething(pc);
		
		Writer1 p1=new Pencil1();
		k.doSomething(p1);
		
		

	}

}
