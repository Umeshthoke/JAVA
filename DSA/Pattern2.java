package DSA;

public class Pattern2 {

	      public static void LeftPattern(int n){
	    	  
	    	    for(int i=1;i<=5;i--) {
	    	    	for(int j=1;j<=i;j++) {
	    	    		
	    	    		System.out.print("*");
	    	    	}
	    	    	
	    	    	System.out.println();
	    	    	
	    	    }
	    	  
	      }
	      
	      public static void main(String []args) {
	    	  
	    	  int n=5;
	    	  LeftPattern( n);
	      }
}
