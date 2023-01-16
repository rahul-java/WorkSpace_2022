package maxi;

public class StringUtility {
	public void reverse(String s)
	{  //ram
		/*char[] t = s.toCharArray();
		for(int i=t.length-1;i>=0;i--)
		{
			System.out.print(t[i]);
		}*/
		
		String s2="";
		for(int i=s.length()-1;i>=0;i--)
		{
			char r = s.charAt(i);
			s2=s2+r;
		}
		System.out.println(s2.trim());
		
	}
	public void reverseWold(String s)
	{   String s2="";
		String[] t = s.split(" ");
		for(int i=t.length-1;i>=0;i--)
		{
			s2+=" "+t[i];
		}
		System.out.println(s2.trim());
		
	}
	public void removeMultipleSpace(String b)
	{
		
		//b=b.replaceAll("( )+", " ").trim(); // only remove space
		//System.out.println(b);
		b=b.replaceAll("\\s+", " ").trim();//space and tab
		System.out.println(b);
	}
	public void spaceCount(String b)
	{    int counttt=0;
		b=b.replaceAll("\\s+", " ").trim();
		 String[] r = b.split("");
		for(int i=0; i<r.length;i++)
		{
			if(r[i].equals(" "))
			{
				counttt++;
			}
		}
		System.out.println("totl space "+counttt+"length"+r.length);
		
	}
	public void duplicateChar(String s)
	{
		// home work
	}
	public void countSPL(String s)
	{   s=s.replaceAll("\\s+", " ").trim();
		int d=0; int l=0; int spl=0;  int spce=0;
		char[] d1 = s.toCharArray();
		for(Character p:d1)
		{
			if(Character.isDigit(p))
			{
				d++;
			}
			else if(Character.isSpaceChar(p))  ///if(Character.isSpace(p))
			{
				spce++;
			}
			else if(Character.isLetter(p))
			{
				l++;
			}
			
			else
			{
				spl++;
			}
		}
		
		
		System.out.println("spl "+spl+" lettr "+l+"  digit "+d+" space "+spce);
		
	}
	public void split(String s)
	{
		// home work
	}
	public void countCharFromString(String s)
	{
		// home work
	}
	public static void main(String[] args) {
		String s="h2 8# k1hhhhh h9hhhh@hhhhhh   nmmmmmpppp    hh66778898999"
				+ "&&&&&&&&&&&&&&A&&&&&&&&&&&&&&&HHHHHHHHHHHHHHHHH"
				+ "11111  1111111  1111111111111111111$$$$  $$$$$$$$$$$$ "
				+ "************************************ hhhhhhhhhhhhhhhh";
		StringUtility ob = new StringUtility();
		ob.reverse(s);
		ob.reverseWold(s);
		ob.removeMultipleSpace(s);
		ob.spaceCount(s);
		ob.countSPL(s);
	}

}
