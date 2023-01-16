package jdbsPostgres.max;

public class Cl {
	public static void main(String[] args) {
		UserDAO userDAO=new UserDAO();
		int rest = userDAO.insertUserDetails(111, "Rahul pandey ji", "Rajapur");
		
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
