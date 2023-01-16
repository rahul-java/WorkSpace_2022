package max;

public abstract class BTax extends CTax{
public String tax(int sal)
{
	 int tax=0;
		int asal=sal*12;
		if(asal<=500000)
			tax=0;
		else if(asal>500000 && asal<=1000000)
		{
			tax=((asal-500000)*5)/100;
		}
		else if(asal>1000000 && asal<=2000000)
		{
			tax=50000 +((asal-1000000)*10)/100;
		}
		else if(asal>1000000 && asal<=2000000)
		{
			tax=125000+((asal-1000000)*30)/100;
		}
		return "BTAX---->"+tax;
		
	}

}
