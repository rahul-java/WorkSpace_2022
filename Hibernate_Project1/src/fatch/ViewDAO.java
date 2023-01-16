package fatch;

import java.util.List;

import max.dao.UserDTO;
import max.utility.SessionUtility;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class ViewDAO {
	public  List<UserDTO> getData()
	{
		try {
			Session s = SessionUtility.getSessss();
			 Transaction tx = s.beginTransaction();
			Query q = s.createQuery("from UserDTO");
			  List<UserDTO> l=q.list();
			  tx.commit();
			  return l;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	
	
	public  UserDTO getData(int td)
	{
		try {
			Session s = SessionUtility.getSessss();
			 Transaction tx = s.beginTransaction();
			Query q = s.createQuery("from UserDTO where tid=:tttttd");
			q.setParameter("tttttd", td);
			  List<UserDTO> l=q.list();
			  tx.commit();
			  
			  return l.get(0);
			  
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	
	
	public List<UserDTO> getDataByCreteriya()
	{
		Session s = SessionUtility.getSessss();
		 Transaction tx = s.beginTransaction();
		Criteria cr = s.createCriteria(UserDTO.class);
		List<UserDTO> l=cr.list();
		tx.commit();
		return l;
	}
	public UserDTO getDataByCreteriya(int td)
	{
		Session s = SessionUtility.getSessss();
		 Transaction tx = s.beginTransaction();
		Criteria cr = s.createCriteria(UserDTO.class);
		cr.add(Restrictions.eq("tid", td));
		List<UserDTO> l = cr.list();
		return l.get(0);
		
		
	}

}
