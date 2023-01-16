package jdbsPostgres.dlt;

public class DeleteClient {
public static void main(String[] args) {
	  int rst = DeleteDAO.deleteRecords(33);
	   if(rst>0)
	   {
		   System.out.println("Deleted from table "+rst);
	   }
	   else
	   {
		   System.out.println("Unable to Delete....");
	   }
}
}
