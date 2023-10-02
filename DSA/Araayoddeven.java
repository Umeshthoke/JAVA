package DSA;

public class Araayoddeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]number1= {12,23,43,45,24,54};
		
	    System.out.println("Even Numbers:");
		
		for(int i=0;i<number1.length;i++) {
			
			
			   if(number1[i]%2==0) {
				   
				   
				   System.out.println(number1[i]);
			   }
		}
		
	    System.out.println("Odd Numbers:");
	    
	    for(int i=0;i<number1.length;i++) {
	    	
	    	if(number1[i]%2!=0) {
	    		System.out.println(number1[i]);
	    	}
	    }
			   
		

	}

}
