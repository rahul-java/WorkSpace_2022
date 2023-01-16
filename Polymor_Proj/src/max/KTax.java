package max;

public class KTax extends BTax{
	public String tax(int sal)
	{
		 int tax=0;
			int asal=sal*12;
			if(asal<=500000)
				tax=0;
			else if(asal>500000 && asal<=1000000)
			{
				tax=((asal-500000)*10)/100;
			}
			else if(asal>1000000 && asal<=2000000)
			{
				tax=50000 +((asal-1000000)*20)/100;
			}
			else if(asal>1000000 && asal<=2000000)
			{
				tax=125000+((asal-1000000)*30)/100;
			}
			return "KTAX---->"+tax;
			
		}

}
