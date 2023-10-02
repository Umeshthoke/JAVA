package DSA;
import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter The Number");
		int number[]=new int[5];
		
		for(int i=0;i<number.length;i++) {
			
			number[i]=sc.nextInt();
		}
		System.out.println("Printing The Element:");
		
		for(int i=0;i<number.length;i++) {
			
			System.out.println(number[i]);
		}
		System.out.println("Reverse the number:");
		
		for(int i= number.length-1;i>=0;i--) {
			
			System.out.println(number[i]);
		}
		

	}

}
