package max.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import Utility.SessionUtility;

public class UserDAO {

	public boolean saveUserDetails(UserDTO dto)
	{
		try {
			Session s = SessionUtility.getSession();
			Transaction tx = s.beginTransaction();
			s.persist(dto);   // save(), saveOrUpdate(), persist()
			//s.save(dto);
			//s.saveOrUpdate(dto);
			tx.commit();
			
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// native increament assigned 
		
		return false;
		
	}
}
