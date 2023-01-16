package max.fatch;

import java.util.List;

import max.dao.UserDTO;

public class ViewCL {
public static void main(String[] args) {
	
	ViewDao viewDao = new ViewDao();
//	List<UserDTO> pp = viewDao.fatchDataByHQL();
//	for(UserDTO q:pp)
//	{
//		System.out.println(q.getUid()+"  "+q.getName()+"  "+q.getPhone()+"  "+q.getAdd());
//	}
	
	UserDTO p = viewDao.fatchDataByHQLhhhhhh(27);
	System.out.println(p.getUid()+"  "+p.getName()+"  "+p.getPhone()+"  "+p.getAdd());

}
	
}
