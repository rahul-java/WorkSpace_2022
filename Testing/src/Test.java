
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr= {1,2,1,1,3,4,1,2,3,4,5,6,1,2,3,10};
		int max=0,n=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
				max=arr[i];
			System.out.println(max);
		}
		System.out.println(max);
			int a[]=new int[max+1];
			for(int i=0;i<a.length;i++)
			{
				System.out.println("new array : "+a[i]);
			}
			System.out.println(" new array size : "+a.length+"\t"+a);
		for(int j=0;j<arr.length;j++)
		{
			System.out.println("@@@@@@@@@@@");
		n=a[arr[j]]++;	
		System.out.println(n);
			
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println("new array : "+a[i]);
		}
		System.out.println(" new array size : "+a.length+"\t"+a);
		for(int k=0;k<=max;k++)
		{
			if(a[k]>1)
				System.out.println(k+"---"+a[k]);
		}
		}
	
}
