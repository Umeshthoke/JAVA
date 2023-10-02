package DSA;

public class MaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number2[]= {23,12,35,45,24};
		
		int max=number2[0];
		
		for(int i=0;i<number2.length;i++) {
			
			if(number2[i]>max) {
				
				max=number2[i];
			}
		}
		System.out.println("Maximum Number:"+max);

	}

}
