package user;

import java.util.ArrayList;

public class UserDAOClient {
public static void main(String[] args) {
	
	//UserDAO.insertUserData(110, "raam avatar","UP");
	//UserDAO.insertUserData(11, "kam","jko");
	//UserDAO.insertUserData(17, "dam","lko");
	//UserDAO.insertUserData(14, "yam","lko");
	//UserDAO.insertUserData(11311, "waam","lko");
	
	ArrayList<Userbin> l=UserDAO.showUserData("all");
	for(Userbin u:l)
	{
		System.out.println(u.getUid()+"   " +u.getName()+"  " +u.getAddress());
	}
}
}
