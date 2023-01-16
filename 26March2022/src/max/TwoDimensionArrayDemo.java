package max;

public class TwoDimensionArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,4};
		int b[]= {5,6,7,8};
		int c[]= {9,10,11,12};
		
System.out.println("*************Enhanced for loop*************");
		
		int arr[]= {4,5,6,7};
		for(int k:arr)
		{
			System.out.println(k);
		}
		
		int d[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		
		System.out.println(d[0][3]);
		System.out.println(d[0][0]);
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(" "+d[i][j]);
			}
			System.out.println();
		}
		///////////////////////////////////////////Enhanced for loop;
		for(int k[]:d)
		{
			for(int m:k)
			{
				System.out.print(" "+m);
			}
			System.out.println();
		}
		System.out.println("*************Jagged Array*************");
		
		int e[][]= {
				     {11,22,33,44},
				     {55,66,77},
				     {99,10,11,12,88}
				     };
		
		for(int i=0;i<e.length;i++)
		{
			for(int j=0;j<e[i].length;j++)
			{
				System.out.print(" "+e[i][j]);
			}
			System.out.println();
		}
		///////////////////////////////////////////Enhanced for loop;
		for(int k[]:e)
		{
			for(int m:k)
			{
				System.out.print(" "+m);
			}
			System.out.println();
		}
		
		
	}

}
