package jdbsPostgres.max1;

public class Cl {
	public static void main(String[] args) {
		UserDAO userDAO=new UserDAO();
		int rest = userDAO.insertUserDetails(12, "Will Smith", " Gr. noida");
		if(rest>0)
		{
			System.out.println("succcesss");
		}
		else
		{
			System.out.println("errrrorrr");
		}
	}

}
