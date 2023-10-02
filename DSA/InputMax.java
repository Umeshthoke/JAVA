package DSA;
import java. util.Scanner;

public class InputMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		Scanner sc=new Scanner(System.in);
		int Umesh[]=new int [4];
		
		System.out.println("Enter The Element:");
		
		for(int i=0;i<Umesh.length;i++) {
			
			 Umesh[i]=sc.nextInt();
		}
		int maxnumber=Umesh[0];
		
		for(int i=0;i<Umesh.length;i++) {
			
			if(Umesh[i]>maxnumber) {
				
				maxnumber=Umesh[i];
			}
		}
		System.out.println("Max Number:"+maxnumber);
		
	}

}
