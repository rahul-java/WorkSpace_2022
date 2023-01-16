package jdbsPostgres.dlt;

import java.sql.Connection;
import java.sql.PreparedStatement;

import jdbsPostgres.max.ConnUtil;

public class DeleteDAO {
	public static int deleteRecords(int eid)
	{
		try {
			Connection con = ConnUtil.getConnnnn();
PreparedStatement ps = con.prepareStatement("update emp set cflag = ? where eid=?");
		      ps.setInt(1, 1);
		      ps.setInt(2, eid);
		     int i= ps.executeUpdate();
		     if(i>0)
		     {
		    	 return eid;
		     }
		      
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

}
