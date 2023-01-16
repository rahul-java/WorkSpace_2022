package max.fatch;

import java.util.List;

import max.dao.UserDTO;

public class ViewCLByCriteria {
public static void main(String[] args) {
	
	ViewDao viewDao = new ViewDao();
//	List<UserDTO> l = viewDao.fatchDataByCriteria();
//	for(UserDTO q:l)
//	{
//		System.out.println(q.getUid()+"  "+q.getName()+"  "+q.getPhone()+"  "+q.getAdd());
//	}
	
	UserDTO l = viewDao.fatchDataByCriteria(26);
	System.out.println(l.getUid()+"  "+l.getName()+"  "+l.getPhone()+"  "+l.getAdd());
	
}
}