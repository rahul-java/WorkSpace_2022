package max;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList<String> l=new LinkedList<String>();
		l.add("A");
		l.add("B");
		l.add("H");
		l.add("D");
		l.addFirst("W");
		l.add(2, "ok");
		for(String p:l)
		{
			System.out.println(p);
		}
	}

}
