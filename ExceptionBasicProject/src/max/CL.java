package max;

public class CL {
public static void main(String[] args) {
	 CustomExp b = new CustomExp();
	 
	try {
		String r = b.mul(10, 0);
		System.out.println(r);
	}
	catch (CustomExp e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	catch (A e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	catch (B e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	
}
}
