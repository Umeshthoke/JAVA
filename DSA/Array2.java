package DSA;
import java.util.Scanner; 

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Count");
		int size=sc.nextInt();
		int numbers[]=new int[size];
		
		
		for(int i=0;i<size;i++) {
			
			System.out.println("Enter the Element");		
			numbers[i]=sc.nextInt();
		}
		
		int sum=0;
		
		for(int i=0;i<numbers.length;i++) {
			
			sum=sum+numbers[i];
		}
		
		System.out.println("Sum Of Array:"  +sum);
		
		

	}

}
