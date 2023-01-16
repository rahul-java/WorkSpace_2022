package fatch;

import java.util.List;

import max.bean.Child;
import max.bean.Father;
import max.dao.ParentsDAO;

public class ViewCLBYHQL {
	public static void main(String[] args) {
		ParentsDAO b=new ParentsDAO();
		//List<Father> t = b.viewBYHQL();
		List<Father> t = b.viewBYCriteria();
		for( Father f: t)
		{
			System.out.println(f.getFid()+" "+f.getName()+" "+f.getAdd());
			 List<Child> list = f.getClist();
			 for( Child c:list)
			 {
				 System.out.println(c.getCid() +" "+c.getName()+" "+c.getGndr());
			 }
			 
			 
		}
		
		
		
	}

}
