package max.bo;

import max.bean.User;
import max.dao.UserDAO;
import max.dao.UserDTO;

public class UserBO {
	
	public boolean getData(User u)
	{
		UserDTO udto = new UserDTO();
		udto.setName(u.getName().toUpperCase());
		udto.setAdd(u.getAdd());
		
		return new UserDAO().getUserDetails(udto);
	}

}
