package DSA;

public class Minimum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int Array4[]= {12,34,56,7,35,67};
		
		int min=Array4[0];
		
		for(int i=0;i<Array4.length;i++) {
			
			if(Array4[i]<min) {
				
				//updating the Minimum Number
				 min=Array4[i];
			}
		}
		System.out.println("Minimum Number:" +min);
		
	}

}
