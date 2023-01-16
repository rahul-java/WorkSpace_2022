package max;

public class UserDefinedException {

	public static void main(String[] args) {

int i,j,k;
i=10;j=0;
try
{

	k=i/j;
	if(k==0)
		throw new RahulException("This is not possible...");
}
catch(Exception e)
{
	System.out.println("Error ....."+e.getMessage());
}


	}

}
