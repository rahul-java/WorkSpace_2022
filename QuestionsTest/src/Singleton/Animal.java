package Singleton;

public class Animal {
	private static Animal animal=null;
	
	private Animal() {
		//by making it private no one create its object out side of the class
	}
	
	public static Animal getInstance()
	{
		if(animal==null)
			animal=new Animal();
		return animal;
	}

}
