package max;

class Casio
{
	int n1;
	int n2;
	String operation;
	
	public void add(int i,int j)
	{
		System.out.println(i+j);
	}
	
	public void add(int i,int j,int k)
	{
		System.out.println(i+j+k);
	}
	
	public void add(double i,double j)
	{
		System.out.println(i+j);
	}
	
/*
 Constructor Overloading...........
 */
	
	public Casio()
	{
		n1=1;
		n2=1;
		operation="nothing";
		System.out.println(n1+"\t"+n2+"\t"+operation);
	}
	public Casio(int i)
	{
		n1=i;
		n2=1;
		operation="nothing";
		System.out.println(n1+"\t"+n2+"\t"+operation);
	}
	public Casio(int i,int j)
	{
		n1=i;
		n2=j;
		operation="nothing";
		System.out.println(n1+"\t"+n2+"\t"+operation);
	}
	
	public Casio(int i,int j,String str)
	{
		n1=i;
		n2=j;
		operation=str;
		System.out.println(n1+"\t"+n2+"\t"+operation);
	}
}
public class MethodOverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Casio obj=new Casio();
		Casio obj1=new Casio(5);
		Casio obj2=new Casio(5,10);
		Casio obj3=new Casio(10,100,"Add");
		obj.add(2,3);
		obj.add(4, 5, 6);
		obj.add(5.6, 9.9);
	}

}
