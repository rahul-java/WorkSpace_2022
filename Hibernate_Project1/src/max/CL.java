package max;

import java.util.Scanner;

import max.bean.User;
import max.bo.UserBO;

public class CL {
   public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	   System.out.println("Enter Name");
	  String n = s.nextLine();
	   System.out.println("Enter Add");
	   String ad = s.nextLine();
	   
	User u = new User();
	u.setAdd(ad);
	u.setName(n);
	UserBO ub = new UserBO();
	if(ub.getData(u))
	{
		System.out.println("successs");
	}
	else
	{
		System.out.println("failllll");
	}
}
}
