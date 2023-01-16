package jdbsPostgres.max;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UserDAO {
	public int insertUserDetails(int eid,String name,String add){
		try {
			
			Connection con = ConnUtil.getConnnnn();
			PreparedStatement ps = con.prepareStatement("insert into emp values (?,?,?,?)");
		  ps.setInt(1, eid);
		  ps.setString(2, name);
		  ps.setString(3,add);
		  ps.setInt(4, 0);
		  int i = ps.executeUpdate();
		  if(i>0)
		  {
			  return eid;
		  }
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
		
		
		
	}
	
	public boolean update(int eid, String add)
	{
		try {
			Connection con = ConnUtil.getConnnnn();
			  PreparedStatement ps = con.prepareStatement("update emp set address=? where eid=?");
			    ps.setString(1, add);
			    //ps.setInt(1, 0);
			    ps.setInt(2, eid);
			   int i = ps.executeUpdate();
			   if(i>0)
			   {
				   return true;
			   }
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	
	
	
	

}
