package maxi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class EmpDAO {
	
	public int insertDetail(int eid,String name,String add)
	{
		try {
			Class.forName("org.postgresql.Driver");
Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/dba", "postgres", "postgres");
PreparedStatement ps = con.prepareStatement("insert into emp values (?,?,?)");
   ps.setInt(1, eid);
   ps.setString(2, name);
   ps.setString(3, add);
  return ps.executeUpdate();
     
		} catch (Exception e) {
			// TODO: handle exception
		}
		return 0;
		
		
		
	}

}
