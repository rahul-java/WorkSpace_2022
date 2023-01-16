package leap_year;

public class LeapYear {

	public static void main(String[] args) {
		
		int year=2022;
		
		if(year%400==0 || (year%4==0 && year%100!=0))
			System.out.println("LEAP YEAR :"+year);
		else 
			System.out.println("NOT LEAP YEAR :"+year);
		

	}

}
