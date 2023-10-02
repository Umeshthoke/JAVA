package DSA;
import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int size=sc.nextInt();
		int array3[]=new int[size];
		
		for(int i=0;i<size;i++) {
			
			array3[i]=sc.nextInt();
		}
		
		System.out.println("Even Number:");
		for(int i=0;i<array3.length;i++) {
		if(array3[i]%2==0) {
			
			System.out.println(array3[i]);
		}
			
		}
		
		System.out.println("Odd Number:");
		for(int i=0;i<array3.length;i++) {
			
			if(array3[i]%2!=0) {
				System.out.println(array3[i]);
			}
		}
		

	}

}
