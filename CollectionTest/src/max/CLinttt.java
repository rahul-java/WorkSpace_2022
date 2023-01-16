package max;

import java.util.List;

public class CLinttt {
public static void main(String[] args) {
	
	List<Train> list = CustomSorting.getData();
	
	for(Train p:list)
	{
System.out.println(p.getTime()+" "+p.getName()+" "+p.getDstn()+" "+p.getSstn());
	}
	
	
	
}
}
