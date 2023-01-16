package jdbsPostgres.fatch;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import jdbsPostgres.max.ConnUtil;

public class FatchDAO {
	
	public static ArrayList<Emp> getEmpDetails(String n)
	{   
		ArrayList<Emp> list = new ArrayList<Emp>();
		try {
			String q="select * from emp ";
			
			Connection con = ConnUtil.getConnnnn();
			
			PreparedStatement ps=null;
			if(n.equalsIgnoreCase("All"))
			{
				ps = con.prepareStatement(q +" where cflag=0");
			}
			else
			{
				int ed = Integer.parseInt(n);
				ps = con.prepareStatement(q+" where eid = ? and cflag=0");
				ps.setInt(1, ed);
			}
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				Emp e=new Emp ();
				 e.setId(rs.getInt(1));
				 e.setName(rs.getString(2));
				 e.setAddress(rs.getString(3));
				 list.add(e);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

}
