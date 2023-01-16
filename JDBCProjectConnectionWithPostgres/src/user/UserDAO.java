package user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UserDAO {
	static Connection con= null;
	public static void insertUserData(int uid,String name,String address)
	{
		con=UserConnection.getConnection();
		try {
			PreparedStatement ps=con.prepareStatement("insert into userdata values (?,?,?)");
			ps.setInt(1, uid);
			ps.setString(2, name);
			ps.setString(3, address);
			int n=ps.executeUpdate();
			
			if(n>0) {
				System.out.println("data inserted successfully"+n);
				
			}
			else
			{
				System.out.println("error");
				
			}
				
				
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static ArrayList<Userbin> showUserData(String n)
	{
		con=UserConnection.getConnection();
		ArrayList<Userbin> list=new ArrayList<Userbin>();
	try {
		
		if(n.equalsIgnoreCase("ALL"))
		{
			PreparedStatement ps=con.prepareStatement("select * from userdata  ");
			ResultSet rs=ps.executeQuery();
		while(rs.next()) 
		{
			 Userbin user=new Userbin();
			 user.setUid(rs.getInt(1));
			 user.setName(rs.getString(2));
			 user.setAddress(rs.getString(3));
			 list.add(user);
			 
			
		}
		}
		else
		{
			PreparedStatement ps=con.prepareStatement("select * from userdata where uid=?");
			ps.setInt(1, Integer.parseInt(n));
			ResultSet rs=ps.executeQuery();
		while(rs.next()) 
		{
			 Userbin user=new Userbin();
			 user.setUid(rs.getInt(1));
			 user.setName(rs.getString(2));
			 user.setAddress(rs.getString(3));
			 list.add(user);
		}
		
		
	}
	}catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return list;
	
	}
	
	
}
