package maxi;

public class StringBufferTest {
	public static void main(String[] args) {
		StringBuffer s =new StringBuffer();
		StringBuilder s1 = new StringBuilder();
		System.out.println("Cpacity of StringBuffer :"+s.capacity());
		System.out.println("Cpacity of StringBuilder :"+s1.capacity());
		StringBuffer s2 =new StringBuffer("one");
		StringBuilder s3 = new StringBuilder("one");
		System.out.println("------"+s2.capacity());
		System.out.println("+++++++"+s3.capacity());
		s2.append("Rahul is a ggood");
		System.out.println("Capacity after adding s2: "+s2.capacity());
		s3.append("Rahul is a ggood");
		System.out.println("Capacity after adding s3: "+s3.capacity());
		System.out.println("===========================");
		s2.append("Rahul is a ggood");
		System.out.println("Capacity after adding s2: "+s2.capacity());
		s3.append("Rahul is a ggood");
		System.out.println("Capacity after adding s3: "+s3.capacity());
	}

}
