package max;

import org.apache.log4j.Logger;

public class CL {
	static Logger log=Logger.getLogger(CL.class);
	static Logger log1=Logger.getLogger(CustomExp.class);
public static void main(String[] args) {
	 CustomExp b = new CustomExp();
	 
	try {
		String r = b.mul(2, 0);
		System.out.println(r);
		
	}
	catch (CustomExp e) {
		log.error("by verr "+e.getMessage());
		e.printStackTrace();
	}
	catch (A e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		log1.error("Class A by Error "+e.getMessage());
	}
	catch (B e) {
		log.fatal("hillleee "+e.getMessage());
		e.printStackTrace();
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	
}
}
