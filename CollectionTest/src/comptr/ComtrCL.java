package comptr;

import java.util.Collections;
import java.util.List;

public class ComtrCL {
	public static void main(String[] args) {
		CompratorTest b=new CompratorTest();
		List<Usr> t = b.getData();
		for(Usr p:t)
		{
			System.out.println(p.uid +" "+p.name);
		}
		
		Collections.sort(t, new NameSorting());
		for(Usr p:t)
		{
			System.out.println(p.uid +" "+p.name);
		}
		
		Collections.sort(t, new UIDSorting());
		System.out.println("---sorting----");
		for(Usr p:t)
		{
			System.out.println(p.uid +" "+p.name);
		}
		
	}

}
