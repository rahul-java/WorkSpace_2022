package maxi;

public final class B {
	
	final String tid;
	
	B(String d)
	{
		tid=d;
	}
	public static B getBOOOj(String d)
	{
		return new B(d);
	}
	public String toString()
	{
		return tid;
	}

}
