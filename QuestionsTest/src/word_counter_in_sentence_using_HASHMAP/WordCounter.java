package word_counter_in_sentence_using_HASHMAP;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class WordCounter {

	public static void main(String[] args) {
		
		String str="rahul is a is good boy but that boy is bad like rahul";
		String[] split = str.split(" ");
		Map<String, Integer> hashMap = new HashMap<>();
		
		for(String k:split)
		{
			Integer v = hashMap.get(k);
			if(v==null)
				v=0;
			hashMap.put(k, v+1);
		}
		Iterator<String> iterator = hashMap.keySet().iterator();
		
		
//		while(iterator.hasNext())
//		{
//			String next = iterator.next();
//			System.out.println(next+" : "+hashMap.get(next));
//		}
		
		
		while(iterator.hasNext())
		{
			String key = iterator.next();
			if(hashMap.get(key)>1)
			{
				System.out.println(key+" : "+hashMap.get(key));
			}
			
		}
		
		//System.out.println(hashMap);

	}

}
