package maxit;
//Object-getClass, hashCode,toString finalize,wait,notify,equals,clone
public class T {
	public void m()
	{
		System.out.println("mmmmmm");
	}
	public void finalize()
	{
		System.out.println("finalize");
	}
	
	public static void main(String[] args) {
		T t = new T();
		t.m();
		t=null;
		System.gc();
	}

}
