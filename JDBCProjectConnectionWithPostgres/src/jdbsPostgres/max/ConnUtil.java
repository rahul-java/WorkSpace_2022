package jdbsPostgres.max;
import java.sql.Connection;
import java.sql.DriverManager;
public class ConnUtil {
	static Connection con=null;
  static
  {
	  try {
		Class.forName("org.postgresql.Driver");
	 con = DriverManager.getConnection("jdbc:postgresql://localhost/java", "postgres", "postgres");
	} catch (Exception e) {
		e.printStackTrace();
	}
	  
  }
  
  public static Connection getConnnnn()
  {
	  return con;
  }
  
  
}
