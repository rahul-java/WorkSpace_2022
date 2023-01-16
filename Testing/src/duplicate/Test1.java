package duplicate;

import java.util.HashMap;
import java.util.Map;

public class Test1 {
	
	public static void main(String[] args) {
		Test1.checkDuplicate1();
		Test1.checkDuplicate2();
		Test1.checkDuplicate3();
		Test1.m1();
	}

	public static void checkDuplicate1()
	{
		String str="AbcvvAbvcdzxyy";
		Map<Character, Integer> map = new HashMap<Character,Integer>();
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(map.containsKey(ch))
			{
				int count=map.get(ch);
				count++;
				map.put(ch, count);
			}
			else
			{
				map.put(ch, 1);
			}
		}
		System.out.println(map);
	}
	
	public static void checkDuplicate2()
	{
		String str="AbcvvAbvcdzxyy";
		int count=0;
		for(int i=0;i<str.length();)
		{
			for(int j=0;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					count++;
				}
			}
			System.out.println(str.charAt(i)+" : "+count);
			String s= String.valueOf(str.charAt(i)).trim();
			str=str.replaceAll(s, "");
			count=0;
		}
		
	}
	
	public static void checkDuplicate3()
	{
		String str="AbcvvAbvcdzxyy";
		System.out.println("***************************************");
		for(int i=0;i<str.length();)
		{
			char[] ch=str.toCharArray();
			int count=0;
			for(int j=0;j<str.length();j++)
			{
				if((ch[i]==ch[j])&&(ch[i]>=65&&ch[i]<=91)||(ch[i]>=97&&ch[i]<=123))
				{
					count++;
				}
			}
			if(count!=0)
			  System.out.println(ch[i]+" : "+count);
			str=str.replaceAll(""+ch[i],"");
		}
		
	}
	public static void m1()
	{
String a ="aelloWorldz";

		
		int[] arr = new int[124];

		for (int i = 0; i < a.length(); i++) {
			int c = 0;
			for (int j = 1; j < arr.length; j++) {
				c = a.charAt(i);
				arr[c]++;
				break;

			}

		}
		for (int k = 1; k < arr.length; k++) {
			if (arr[k] > 1) {
				System.out.println((char) k + " --->" + arr[k]);

			}

		}
	}
	
	
}
