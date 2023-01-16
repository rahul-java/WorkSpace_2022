package max;
@FunctionalInterface
interface A1
{
	public void show();
}
public class LamdaExpressionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
A1 ob=()->{System.out.println("This is lamda expression...");};
ob.show();
	}

}
