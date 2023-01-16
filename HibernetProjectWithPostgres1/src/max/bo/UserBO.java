package max.bo;

import max.bean.UserBean;
import max.dao.UserDAO;
import max.dao.UserDTO;

public class UserBO {

	public boolean getData(UserBean u)
	{
		UserDTO udto = new UserDTO();
		udto.setName(u.getName().toUpperCase());
		udto.setAdd(u.getAdd());
		udto.setPhone(u.getPhone());
		return new UserDAO().saveUserDetails(udto);
	}
}
