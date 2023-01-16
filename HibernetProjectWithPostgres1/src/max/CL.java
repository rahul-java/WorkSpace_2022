package max;

import java.util.Scanner;

import max.bean.UserBean;
import max.bo.UserBO;

public class CL {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter Name");
	String n = s.nextLine();
	System.out.println("Enter Add");
	String add = s.nextLine();
	System.out.println("Enter Phone");
	String ph = s.nextLine();
	
	UserBean u = new UserBean();
	u.setAdd(add);
	u.setName(n);
	u.setPhone(ph);
	UserBO ub = new UserBO();
	if(ub.getData(u))
	{
		System.out.println("success");
	}
	else
	{
		System.out.println("failed");
	}
}
}
