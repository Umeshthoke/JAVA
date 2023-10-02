package DSA;

import java.util.Scanner;



public class Array {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Count");
		int size=sc.nextInt();
		int number[]=new int[size];
		
		//input
		for(int i=0;i<size;i++) {
		  System.out.println("Enter the Number");
		   number[i]=sc.nextInt();
		 
			
		}
		for(int i=0;i<number.length;i++) {
			
			System.out.println(number[i]);
			
		}
		
		
		
		

	}

}
