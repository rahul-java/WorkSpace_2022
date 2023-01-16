package String;

public class Duplicacy_Remove_from_array
{
	
	public static void main(String[] args) {
		
		int a[] ={4,6,4,4,4,4,5,6,3,7,7,12,1,33,65,9,9,2,2,1,33,1,1,1,1,1,1,1};
		 
		int max=0;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>max) {
				max=a[i];
			}
			
		}
		int[]b=new int [max+1];
		for(int i=0; i<a.length; i++)
		{
			b[a[i]]=b[a[i]]+1;
		}
		for(int j=0; j<b.length; j++) {
			if(b[j]>1)
			{
				System.out.println(j+"Squire of no-->"+j*j);
			}
		}
		
	}

}
