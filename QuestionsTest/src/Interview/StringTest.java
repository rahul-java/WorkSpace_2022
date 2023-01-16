package Interview;

public class StringTest {

	public static void main(String[] args) {
		
		String str="my name my is my rahul my and my name is rahul";
		String[] arr = str.split(" ");
		String[] newString = new String[arr.length];
		int[] newCount = new int[arr.length];
		int c=0;
		String s=null;
		for(int i=0;i<arr.length;i++)
		{
			s=arr[i];
			c=0;
			for(int j=0;j<arr.length ;j++)
			{
				if(s.equals(arr[j]))
				{
					if(c<1)
					{
						newString[j]=s;
						c++;
						newCount[i]=c;
					}
					else 
						{
							c++;
							newCount[i]=c;
							
						}
				}
				
			}
		}

		for(int i=0;i<newString.length;i++)
		{
			if(newString[i]!=null)
				System.out.println(newString[i] +" \t "+newCount[i]);
		}
	}

}
