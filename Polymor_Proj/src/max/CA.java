package max;

public class CA {
	public static void main(String[] args) {
		CTax ctax=new KTax();
		
		String tax = ctax.tax(50000);
		System.out.println(tax);
	}

}
