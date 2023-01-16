package Find_Duplicate_In_Array;

import java.util.HashSet;

public class Remove_DuplicateElement_By_Hashmap {

	public static void main(String[] args) {
		
		int arr[]= {17,8,6,7,9,9,17,8,2,2,3,4,5,5};
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			set.add(arr[i]);
		}
		System.out.println(set);
	}
}
