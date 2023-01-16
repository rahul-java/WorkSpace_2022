package max;

import java.util.Iterator;
import java.util.List;


public class Modi 
{
public static void main(String[] args) 
{
	ListTest listTest=new ListTest();
	List<String> list = listTest.getEmpName();
	System.out.println("before "+list.size());
	for(int i=0;i<list.size();i++)
	{
		System.out.println(list.get(i));
		//list.remove(i);
	}
	System.out.println("after "+list.size());
	System.out.println("---Iterator---");
	    Iterator<String> it = list.iterator();
	    while(it.hasNext())
	    {
	    	String p = it.next();
	    	System.out.println(p);
	    	//if(p.equalsIgnoreCase("raja"))
	    	//it.remove();
	    }
	System.out.println("---for each--jdk1.5--");
	
	    for(String q:list)
	    {
	    	System.out.println(q);
	    	//list.remove(q);
	    }
	    
	    System.out.println("after "+list.size());
}
}
