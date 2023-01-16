package String;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MaxMinOccuringCharacter {

	public static void main(String[] args) {
		
		String str="akanKHHKSmld";
		str=str.replaceAll("\\s", "");
		int[] arr=new int[127];
		
		for(int i=0;i<str.length();i++)
		{
			arr[str.charAt(i)]=arr[str.charAt(i)]+1;
		}
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>0)
				System.out.println((char)(i)+" : "+arr[i]);
		}
		
		System.out.println("-------------------Max Occurring Character---------------------");
		
		int max=-1;
		char c=' ';
		
		for(int i=0;i<str.length();i++)
		{
			if(max<arr[str.charAt(i)])
			{
				max=arr[str.charAt(i)];
				c=str.charAt(i);
			}
		}
		System.out.println(c+" : "+max);

		System.out.println("-------------------By Using HashMap---------------------");
		char[] charArray = str.toCharArray();
		HashMap<Character,Integer> hashMap = new HashMap<Character, Integer>();
		for(char ch:charArray)
		{
			if(hashMap.containsKey(ch))
			{
				hashMap.put(ch, hashMap.get(ch)+1);
			}
			else {
				hashMap.put(ch, 1);
			}
		}
		
		//Using EntrySet
		max=-1;
		c=' ';
		Set<Entry<Character,Integer>>  entrySet = hashMap.entrySet();
		for( Entry<Character, Integer> e: entrySet)
		{
		   System.out.println(e.getKey()+"  :  "+e.getValue());
		   if(max<e.getValue())
			{
				max=e.getValue();
				c=e.getKey();
			}
		}
		System.out.println("Max Character Occures =>"+c+" : "+max);
	}

}
