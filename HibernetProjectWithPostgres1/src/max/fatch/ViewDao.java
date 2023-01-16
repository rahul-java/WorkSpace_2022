package max.fatch;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import Utility.SessionUtility;
import max.dao.UserDTO;

public class ViewDao {

	public List<UserDTO> fatchDataByHQL()
	{
		try {
			Session s = SessionUtility.getSession();
			Transaction tx = s.beginTransaction();
			Query q = s.createQuery("from UserDTO");
			List<UserDTO> list = q.list();
			tx.commit();
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public UserDTO fatchDataByHQLhhhhhh(int uid)
	{
		try {
			Session s = SessionUtility.getSession();
			Transaction tx = s.beginTransaction();
			Query q = s.createQuery("from UserDTO where uid=:okk");
			q.setParameter("okk", uid);
			List<UserDTO> l =  q.list();
			tx.commit();
			return l.get(0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<UserDTO> fatchDataByCriteria()
	{
		try {
			Session s = SessionUtility.getSession();
			Transaction tx = s.beginTransaction();
			Criteria cr = s.createCriteria(UserDTO.class);
			List<UserDTO> l = cr.list();
			tx.commit();
			return l;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
}
	
	public UserDTO fatchDataByCriteria(int ud)
	{
		try {
			Session s = SessionUtility.getSession();
			Transaction tx = s.beginTransaction();
			Criteria cr = s.createCriteria(UserDTO.class);
			 cr.add(Restrictions.eq("uid", ud));
			List<UserDTO> l = cr.list();
			tx.commit();
			return l.get(0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
}
}