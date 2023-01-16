package comptr;

import java.util.Comparator;

public class NameSorting implements Comparator<Usr>{

	@Override
	public int compare(Usr u1, Usr u2) {
		
		return u1.name.compareTo(u2.name);
	}

}
