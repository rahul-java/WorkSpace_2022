package comptr;

import java.util.Comparator;

public class UIDSorting implements Comparator<Usr>{

	@Override
	public int compare(Usr u1, Usr u2) {
		
		if (u1.uid==u2.uid)
			return 0;
		else if(u1.uid>u2.uid)
			return 1;
		return -1;
	}

}
