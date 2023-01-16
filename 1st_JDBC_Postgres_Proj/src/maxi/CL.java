package maxi;

public class CL {
	public static void main(String[] args) {
		int eid=1;
		String n="Rahul kumar Pandey";
		String add="Delhi";
		EmpDAO empDAO=new EmpDAO();
		if(empDAO.insertDetail(eid, n, add)>0)
		{
			System.out.println("successs");
		}
		else
		{
			System.out.println("erroroorro");
		}
			
	}

}
