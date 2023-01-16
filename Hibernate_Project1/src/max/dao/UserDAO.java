package max.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import max.utility.SessionUtility;

// UserDTO -- HBM 3.0-- cfg.xml- sessionutility
public class UserDAO {
  public boolean getUserDetails(UserDTO dto)
  {
	  // hibernate
	  try {
		Session s = SessionUtility.getSessss();
		 Transaction tx = s.beginTransaction();
		 // 
		  s.persist(dto);
		 // s.save(dto);
		 // s.saveOrUpdate(dto);
		 tx.commit();
		 
return true;
	} catch (Exception e) {
		// TODO: handle exception
	}
	  
	  
	return false;
	  
  }
}
