package Find_Maximum_no;

public class B {

	public static void main(String[] args) {
		
		int a=357;
		int b=4;
		int s=3;
		int o=8;
		int l=2;
		int maximume=0;
		
		if(a>b&&a>l)
		{
			maximume=a;
		}
		else if(b>s&&b>l)
		{
			maximume=b;

		}
		else if(s>o&&s>l)
		{
			maximume=s;
		
		}
		else if(o>l&&o>l)
		{
			maximume=o;

		}
		else
		{
			maximume =l;
		}
		
		System.out.println("Find maximume no>> "+maximume);
		
	}
}

























