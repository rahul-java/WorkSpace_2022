
public class Duplicate {

	public static void main(String[] args) {
		
		int[] arr= {1,2,1,1,3,4,1,12,12,12,2,3,4,5,6,1,2,3,10};
		int max=0,n=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
				max=arr[i];
			
		}
		int a[]=new int[max+1];
		for(int i=0;i<arr.length;i++)
		{
			a[arr[i]]=a[arr[i]]+1;
		}
		for(int k=0;k<=max;k++)
		{
			if(a[k]>1)
				System.out.println(k+"---"+a[k]);
		}

	}

}
