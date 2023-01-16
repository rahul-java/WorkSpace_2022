package max;

import org.apache.log4j.Logger;

public class ArrayLTest extends Exception {
	static Logger log=Logger.getLogger(ArrayLTest.class);
	
	ArrayLTest(String s)
	{
		super(s);
	}
	public static int getValue(int n) throws ArrayLTest
	{
		int t[]={77,23,21,6};
		if(n<t.length)
		{
			log.info("Sucessful reult "+t[n]);
			return t[n];
		}
		else
		{
			log.error("User enter greaterthan maxnumberr ");
			throw new ArrayLTest("PLZ enter lessthan "+t.length);
		}
		
	}

}
