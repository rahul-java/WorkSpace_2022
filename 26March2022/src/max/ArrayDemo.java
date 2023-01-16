package max;

class Student
{
	int rollno;
	String name;
}
public class ArrayDemo {

	public static void main(String[] args) {
		
		int arr[]=new int[4];
		int arr1[]= {12,34,56,78};
		
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		
		Student std1=new Student();
		Student std2=new Student();
		Student std3=new Student();
		Student std4=new Student();
		Student std5=new Student();
		
		Student s[]=new Student[5];
		Student s1[]= {std1,std2,std3,std4,std5};
		
		System.out.println(arr[3]);
		
		for(int i=0;i<4;i++)
		{
			System.out.println(arr[i]);
		}
		for(int i=0;i<4;i++)
		{
			System.out.println(arr1[i]);
		}

	}

}
