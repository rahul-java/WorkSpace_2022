package comptr;

import java.util.ArrayList;
import java.util.List;

public class CompratorTest {
	public List<Usr> getData()
	{
		List<Usr> l=new ArrayList<Usr>();
		Usr u=new Usr(3,"sala");
		l.add(u);
		Usr u1=new Usr(3,"bala");
		l.add(u1);
		Usr u2=new Usr(5,"hala");
		l.add(u2);
		Usr u3=new Usr(4,"cala");
		l.add(u3);
		
		return l;
		
	}

}
