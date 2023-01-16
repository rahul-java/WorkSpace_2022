package max;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		try
		{
			int a[]=new int[6];
			a[4]=10;
			a[6]=11;
			int i=9;
			int j=2;
			int k=i/j;
			System.out.println("Output is : "+k);
			//System.out.println("Bye...");
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Error...");
			//e.printStackTrace();
			//System.out.println("Bye...");
		}
		catch(ArrayIndexOutOfBoundsException ar)
		{
			System.out.println("array error");
		}
		catch(Exception e)
		{
			System.out.println("Something Wrong...");
		}
		finally
		{
			System.out.println("...Bye...");
		}

		
	}

}
