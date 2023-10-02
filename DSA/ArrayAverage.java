package DSA;
import java.util.Scanner;

public class ArrayAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		
		for(int i=0;i<number.length;i++) {
			
			number[i]=sc.nextInt();
		}
		int sum=0;
		double avg;
		for(int i=0;i<number.length;i++) {
			
			sum=number[i]+sum;
			
		}
		System.out.println("Sum of Number:" +sum);
		
		avg=sum/5;
		System.out.println("Average of Array:"+avg);

	}

}
