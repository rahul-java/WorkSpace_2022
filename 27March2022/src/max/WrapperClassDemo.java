package max;

public class WrapperClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=5;  //primitive data type
		Integer ii=new Integer(50);   //wrapper class  //storing value in object
		Integer jj=new Integer(i);    //Boxing  Wrapping
		
		Float ff=new Float(5.6);  //
		
		int n=ii.intValue();      //UnBoxing.. Unwrapping
		
		Integer value=i;         //AutoBoxing  AutoWrapping
		int k=value;             //AutoUnboxing   AutoUnwrapping
		System.out.println("k= "+k);
		System.out.println(n);
		System.out.println(jj.intValue());
		System.out.println(ff.floatValue());
		
		String str="123";
		int n1=Integer.parseInt(str);
		System.out.println(n1);
	}

}
