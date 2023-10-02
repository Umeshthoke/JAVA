package DSA;
import java.util.Scanner;

public class SumofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Elements");
		
		for(int i=0;i<num.length;i++) {
			
			num[i]=sc.nextInt();
		}
		System.out.println("Printing the element:");
		
	      int sum=0;
	      
	      for(int i=0;i<num.length;i++) {
	    	  
	    	  sum=num[i]+sum;
	    	  System.out.println(num[i]);
	      }
	      System.out.println( "Sum of Array:" +sum);

	}

}
