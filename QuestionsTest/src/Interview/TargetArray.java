package Interview;

public class TargetArray {

public static void main(String[] args) {
		
//		Example: Input:  arr[]= {4,3,15,8,2,6,1};
//	            Target= 11
	            
//	            Output =[1,3]
		
		
		  int arr[]= {4,3,15,8,2,6,1};
		  
		 
		  for(int i=0; i<arr.length; i++) {
			  
			  for(int j=i+1; j<arr.length; j++ ) {
				  
				  
				  if(arr[i]+arr[j]==11) {
					  
					  System.out.println("Target no-->"+(arr[i]+arr[j]));
					  System.out.println("Index No-->"+i+" :  "+j);
					  
				  }
				  
			  }
       }
}
}
