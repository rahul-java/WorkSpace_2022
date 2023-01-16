
public class Custom_xception extends Exception {
	
	
	
	public Custom_xception(String string) {

	}

	public Custom_xception() {

	}
		
		public  int MyException  (int a) throws Exception
		{
			if(a>18)
			{
				System.out.println("Elegible For Vote");
			}else
			{
				throw new  Exception("Inter the Currect Age");
			}
			return 0;
		
		
	}
		public static void main(String[] args) throws Exception {
			Custom_xception f = new Custom_xception();
			
		       try {
				int ll = f.MyException(4);
			} catch (Custom_xception e) {

				e.printStackTrace();
			}
		}

}

