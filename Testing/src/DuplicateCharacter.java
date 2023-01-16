
public class DuplicateCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="aaabbbcccddddeeefffgjhsjdhfjshdzzzzzzzzzzzzzzzzzzzzzzzzzzzzfk";
		System.out.println(str.length());
		char[] ch=str.toCharArray();
		int[] arr=new int[27];
		for(int j=0;j<str.length();j++)
		{
		for(int i=0;i<arr.length;i++)
		{
			arr[ch[j]-96]++;
			break;
		}
	   }
		for(int k=0;k<arr.length;k++)
		{
			if(arr[k]>0)
			 System.out.println((char)(k+96)+"---"+arr[k]);
		}
	}

}
