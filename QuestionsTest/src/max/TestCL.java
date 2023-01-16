package max;

import java.util.ArrayList;
import java.util.List;

public class TestCL {

	public static void main(String[] args) {	
		List<Laptop> list = new ArrayList<Laptop>();
		
		Laptop laptop1 = new Laptop();
		laptop1.setNameString("HP");
		laptop1.setSizeString("15-inch");
		laptop1.setPriceInteger(20000);
		list.add(laptop1);
		
		Laptop laptop2 = new Laptop();
		laptop2.setNameString("Dell");
		laptop2.setSizeString("17-inch");
		laptop2.setPriceInteger(30000);
		list.add(laptop2);
		
		Laptop laptop3 = new Laptop();
		laptop3.setNameString("Apple");
		laptop3.setSizeString("19-inch");
		laptop3.setPriceInteger(25000);
		list.add(laptop3);
		
		Laptop laptop4 = new Laptop();
		laptop4.setNameString("Samsung");
		laptop4.setSizeString("19-inch");
		laptop4.setPriceInteger(45000);
		list.add(laptop4);
		
		TestCL findLaptop = new TestCL();
		List<Laptop> findLaptopList=findLaptop.findLaptop(25000, list);
		for(Laptop lap:findLaptopList)
		{
			System.out.println("Laptop Name : "+lap.getNameString());
			System.out.println("Laptop Size : "+lap.getSizeString());
			System.out.println("Laptop Prize : "+lap.getPriceInteger());
		}

	}
	
	private List<Laptop> findLaptop(Integer price ,List<Laptop> list)
	
	{
		List<Laptop> newList = new ArrayList<Laptop>();
		for(Laptop lap:list)
		{
			if(lap.getPriceInteger()>price)
			{
				newList.add(lap);
			}
		}
		return newList;
	}

}
