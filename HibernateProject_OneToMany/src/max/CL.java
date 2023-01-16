package max;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import max.bean.Child;
import max.bean.Father;
import max.dao.ParentsDAO;

public class CL {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		List<Child> list=new ArrayList<Child>();
		Father f = new Father();
		System.out.println("Father Name");
		String fn = s.nextLine();
		f.setName(fn);
		System.out.println("Enter Add");
		String fad = s.nextLine();
		f.setAdd(fad);
		while(true)
		{
			Child c = new Child();
			System.out.println("Child Details");
			
			System.out.println("child Name");
			String cn = s.nextLine();
			c.setName(cn);
			System.out.println("Child GNDR");
			String cd = s.nextLine();
			c.setGndr(cd);
			list.add(c);
			System.out.println("Child Y/N");
			String st = s.nextLine();
			
			if(st.equalsIgnoreCase("N"))
			{
				break;
			}
			
			
		}
		
		f.setClist(list);
		ParentsDAO p=new ParentsDAO();
		if(p.insertData(f))
		{
			System.out.println("successs");
		}
		else
		{
			System.out.println("faiiiill");
		}
	}

}
