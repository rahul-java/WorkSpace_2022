package max;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorTest {
	public static void main(String[] args) {
		Vector<String> v=new Vector<String>();
		v.add("A");
		v.add("H");
		v.add("T");
		v.add("R");
		Iterator<String> it = v.iterator();
		while(it.hasNext())
		{
			String r = it.next();
			System.out.println(r);
		}
		
		Enumeration<String> e = v.elements();
		while(e.hasMoreElements())
		{
			String t = e.nextElement();
			System.out.println(t);
		}
	}

}
