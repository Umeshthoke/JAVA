package DSA;

public class Pattern {

	
	
	public static void rightAngleTriangle(int n) {
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=i;j++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
	public static void main(String[]args) {
		
		int n=5;
		rightAngleTriangle(n);
	}
}
