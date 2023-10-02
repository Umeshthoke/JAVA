package DSA;
import java.util.Scanner;
public class FindElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int num[]=new int[5];
          System.out.println("Enter the element");
          Scanner sc=new Scanner(System.in);
         
         int count=0;
          
          for(int i=0;i<num.length;i++) {
        	  
        	  num[i]=sc.nextInt();
          }
          for(int i=0;i<num.length;i++) {
        	  
        	  System.out.println(num[i]);
          }
          System.out.println("find the element");
          int n=sc.nextInt();
          
          for(int i=0;i<num.length;i++ ) {
        	  
        	  if(num[i]==n) {
        		 count++;
        	  }
        	  
          }
          if(count>0) {
        	  System.out.println("Number Found");
          }
          else {
        	  System.out.println("Number Not found");
          }
         
	}

}
