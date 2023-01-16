package max;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ProUtility {
	
	private static Properties p;
	private ProUtility()
	{}
	static
	{   try {
		 p = new Properties();
		InputStream is = p.getClass().getResourceAsStream("/p.properties");
	   
			p.load(is);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static String getValue(String key)
	{
		return p.getProperty(key);
	}

}
