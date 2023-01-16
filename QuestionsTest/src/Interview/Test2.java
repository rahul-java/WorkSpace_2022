package Interview;

import java.util.HashMap;

public class Test2 {

public static void main(String[] args) {
		
	String str="HelloWorld"; 
	
	 HashMap<Character, Integer> map = new HashMap<Character, Integer>();
      
	 for(int i=0; i<str.length(); i++)
	 {
		 
		char ch = str.charAt(i);
		  if(map.containsKey(ch)) {
			   Integer count = map.get(ch);
			  count++;
			  map.put(ch, count);
		  }else {
			  map.put(ch, 1);
			
		}
	 }
	 System.out.println(map);
	
	  }
}
