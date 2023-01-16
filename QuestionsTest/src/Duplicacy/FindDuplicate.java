package Duplicacy;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.Set;

public class FindDuplicate {

	public static void main(String[] args) {
		System.out.println("------------------Using For witin For Loop------------------");
		System.out.println(findDuplicateUsingFor("code decode"));
		System.out.println("------------------Using Array Wastage of memory-----------------");
		System.out.println(findDuplicateUsingArray("code decode"));
		System.out.println("------------------Using HashMap---------------------------");
		System.out.println(findDuplicateUsingMap("code decode"));

	}

	private static Set<Character> findDuplicateUsingMap(String str) {
		
		Set<Character> duplicates = new LinkedHashSet<>();
		HashMap<Character,Integer> hashMap = new HashMap<Character, Integer>();
		
		for(int i=0;i<str.length();i++)
			if(hashMap.containsKey(str.charAt(i)))
			{
				hashMap.put(str.charAt(i), hashMap.get(str.charAt(i))+1);
			}
			else 
			{
				hashMap.put(str.charAt(i), 1);
			}
		Set<Entry<Character,Integer>> entrySet = hashMap.entrySet();
		for(Entry<Character ,Integer > entry:entrySet)
			if(entry.getValue()>1)
				duplicates.add(entry.getKey());
		
		return duplicates;
	}

	private static Set<Character> findDuplicateUsingArray(String str) {
		
		Set<Character> duplicates = new LinkedHashSet<>();
		int[] arrayForChar=new int[256];
		
		for(int i=0;i<str.length();i++)
		{
			arrayForChar[str.charAt(i)]=arrayForChar[str.charAt(i)]+1;
		}
		for(int i=0;i<256;i++)
			if(arrayForChar[i]>1)
				duplicates.add((char)i);
		return duplicates;
	}

	private static Set<Character> findDuplicateUsingFor(String str) {
		
		Set<Character> duplicates = new LinkedHashSet<>();
		
		for(int i=0;i<str.length();i++)
			for(int j=i+1;j<str.length();j++)
				if(str.charAt(i)==str.charAt(j))
					duplicates.add(str.charAt(i));
		return duplicates;
	}

}
