package maxi;

public class StringTest {
	public static void main(String[] args) {
		String s="india";  // A 65 B 66 a  97 0 48-- uc- b 
		System.out.println(s.toUpperCase());
		String s1="india";
		System.out.println(s1.toLowerCase());
		System.out.println(s.substring(3).toUpperCase());
		System.out.println(s.substring(2, 3));
		String s2 = new String("India");// 
		String s3 = new String("india");
		String s4="in";
		      s4=s4+"dia";
		System.out.println(s4.hashCode());
		System.out.println(s4);
		System.out.println(s.hashCode());
		System.out.println(s==s4);
		
		System.out.println("------------------------");
		
		
		
		
		System.out.println(s1.equals(s));
		if(s==s2.intern())
		System.out.println("same memory");
		else
	System.out.println("diff memory");
		char ch[]={'A','a','m'};
	String	ss=new String(ch);
	System.out.println(ss);
	char[] t = s.toCharArray();
		for(int i=0;i<t.length;i++)
		{
			 char p = t[i];
			   
			 System.out.println(p);
		}
		
		
		
		System.out.println(s.charAt(3));
		
	}

}
