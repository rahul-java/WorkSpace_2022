package sorting;

import java.util.Collections;
import java.util.List;

public class TrainMaster {
	public static void main(String[] args) {
		TrainList trainList=new TrainList();
		List<Train> list = trainList.getTrain();
		for(Train p:list)
		{
System.out.println(p.getTime()+" "+p.getName()+" "+p.getSstn()+" "+p.getDstn());
		}
		
		Collections.sort(list);
		System.out.println("---sorting----");
		for(Train p:list)
		{
System.out.println(p.getTime()+" "+p.getName()+" "+p.getSstn()+" "+p.getDstn());
		}
		
	}

}
