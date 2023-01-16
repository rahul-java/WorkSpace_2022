package max;


interface Abc
{
	public void show();
}
class Implementer implements Abc
{

	@Override
	public void show() {
		System.out.println("Anything...");
	}
	
}
public class AnonymousClassWithInterface {

	public static void main(String[] args) {

		//Abc obj=new Implementer();
		
		Abc obj=new Abc()
				{
			
			public void show() {
				System.out.println("I am the best...");
			}
				};
				obj.show();
	}

}
