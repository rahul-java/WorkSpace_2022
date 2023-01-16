package jdbsPostgres.update;

import jdbsPostgres.max.UserDAO;

public class UpdateCl {
	public static void main(String[] args) {
		UserDAO userDAO=new UserDAO();
		if(userDAO.update(11, "chennai")) {
			System.out.println("successsss");
		}
		else
		{
			System.out.println("eroooroororr");
		}
	}

}
