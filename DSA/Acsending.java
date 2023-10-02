package DSA;

public class Acsending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp=0;
		int A[]= {23,45,12,32,6,7,1};
		
		for(int i=0;i<A.length;i++) {
			
			
		   System.out.println(A[i]);
		}
		
		for(int i=0;i<A.length;i++) {
			
			for(int j= i+1;j<A.length;j++) {
				
				if(A[i]>A[i]) {
					
					A[i]=temp;
					A[i]=A[j];
					A[j]=temp;
					
					
				}
			}
			
		}
		
		for(int i=0;i<A.length;i++) {
			
			System.out.println(A[i]);
		}

	}

}
