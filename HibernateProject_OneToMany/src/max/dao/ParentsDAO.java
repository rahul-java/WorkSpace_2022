package max.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import max.bean.Father;
import max.utility.SessionUtility;

public class ParentsDAO {
	
	
	public List<Father> viewBYHQL()
	{
		try {
			Session s = SessionUtility.getSessss();
			Transaction tx = s.beginTransaction();
			Query q = s.createQuery("from Father");
			List<Father> list = q.list();
			return list;
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	
	public List<Father> viewBYCriteria()
	{
		try {
			Session s = SessionUtility.getSessss();
			Transaction tx = s.beginTransaction();
		Criteria cr = s.createCriteria(Father.class);
		//  cr.addOrder(Order.desc("name"));
		  cr.add(Restrictions.ilike("name", "%s%"));
			List<Father> list = cr.list();
			tx.commit();
			return list;
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	
	
	
	
	public boolean insertData(Father f)
	{
		try {
			
			Session s = SessionUtility.getSessss();
			Transaction tx = s.beginTransaction();
			Integer i = (Integer)s.save(f);
			tx.commit();
			if(i>0)
				return true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
