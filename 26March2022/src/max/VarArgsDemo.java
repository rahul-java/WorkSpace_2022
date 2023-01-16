package max;

class Cal{
	
	/*
	public int add(int i,int j)
	{
		return i+j;
	}
	*/
	//Variable Length Argument
	public int add(int ...n )//as an array{2,3,4,5,6,7} as much as u want.
	{
		int sum=0;
		for(int i:n)
		{
			sum+=i;
		}
		return sum;
	}
}
public class VarArgsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cal ob=new Cal();
		System.out.println(ob.add(5, 10));
		System.out.println(ob.add(1,2,3,4,5,6));
		System.out.println(ob.add(1,2,3,4,5,6,7,8,9,10));
	}

}
