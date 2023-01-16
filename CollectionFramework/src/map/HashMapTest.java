package map;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		
		HashMap<String, Integer> course=new HashMap<>();
		course.put("Core-Java", 40000);
		course.put("Advance-Java", 25000);
		course.put("Spring-Boot", 50000);
		course.put("Hibernate", 20000); 
		course.put("Core-Java", 10000);//it will replace privious key and value
		course.put("Angular", 80000);
		course.put("Angular", 100000);//it will replace privious key and value
		System.out.println(course);
		
		System.out.println("=========================================================");
		System.out.println(course.keySet());
		System.out.println(course.size());
		System.out.println("============================ForEach=============================");
		course.forEach((e1,e2)->{
			System.out.println(e1+"=>"+e2);
		});
		System.out.println("============================ForEach=============================");
		course.forEach((key,value)->{
			System.out.println(key+":"+value);
		});
		
		System.out.println("============================SearchByKey=============================");
		System.out.println(course.get("Core-Java"));

	}

}
