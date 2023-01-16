package max;

class Printer
{
	/*
	public void show(Integer i)
	{
		System.out.println(i);
	}
	
	public void show(Double i)
	{
		System.out.println(i);
	}
	*/
	
	public void show(Number i)       //both Integer, Double extends Number class so directly used Number class (super class / Abstract class)
	{
		System.out.println(i);
	}
}

abstract class Writer
{
	
}

class Pen extends Writer
{
	
}

class Pencil extends Writer
{
	
}


public class AbstractDemo1 {

	public static void main(String[] args) {
	

		Printer obj=new Printer();
		obj.show(5.5);
		obj.show(5);
	}

}
