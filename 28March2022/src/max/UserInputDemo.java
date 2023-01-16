package max;

import java.util.Scanner;

public class UserInputDemo {

	public static void main(String[] args) {
		
		int n=0;
		System.out.println("Enter a number : ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("OutPut : "+n*n);
	}
}
