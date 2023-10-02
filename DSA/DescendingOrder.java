package DSA;
import java.util.Scanner; 
public class DescendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int temp;
		int arr[]=new int[5];
		Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Number");
        
        for(int i=0;i<arr.length;i++) {
        	
        	arr[i]=sc.nextInt();
        }
        
        for(int i=0;i<arr.length;i++) {
        	
        	for(int j=i+1;j<arr.length;j++) {
        		
        		if(arr[i]<arr[j]) {
        			
        			temp=arr[i];
        			arr[i]=arr[j];
        			arr[j]=temp;
        		}
        	}
        }
        for(int i=0;i<arr.length;i++) {
        	
        	System.out.println(arr[i]);
        }
	}

}
