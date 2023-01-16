package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class StreamTest1 {

	public static void main(String[] args) {
		
		//Create a list and filter all even nos from list
		
		List<Integer> list1 = List.of(2,23,4,23,40,32,34,15,16,70); //immutable list
		List<Integer> list2 = new ArrayList<>(); //mutable list
		list2.add(12);
		list2.add(112);
		list2.add(120);
		list2.add(121);
		list2.add(123);
		list2.add(115);
		List<Integer> list3 = Arrays.asList(1,2,3,4,5,6,7,8,9,10); //immutable list
		
		//list1
		//without Stream
		List<Integer> evenList=new ArrayList<>();
		List<Integer> oddList=new ArrayList<>();
		for(Integer no:list1)
		{
			if(no%2==0)
			{
				evenList.add(no);
			}
			else 
			{
				oddList.add(no);
			}
		}
		System.out.println("Even Numbers : "+evenList);
		System.out.println("Odd Numbers : "+oddList);
		
		//Using Stream
		Stream<Integer> stream = list1.stream();
		List<Integer> newList = stream.filter(i->i%2==0).collect(Collectors.toList());
		//List<Integer> newList1 = list1.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println("Using Stream EvenNos : \n"+newList);
		
		System.out.println("Nos >=25 \n"+list1.stream().filter(i->i>=25).collect(Collectors.toList()));
		
		
	}

}
